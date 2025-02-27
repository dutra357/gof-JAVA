package org.example.abstractFactory.aula.redecard;

import org.example.abstractFactory.aula.interfaces.Operadora;

import java.math.BigDecimal;

public class RedeCard implements Operadora {

    private Long codigoConfirmacao = -1L;

    @Override
    public void capturar(String cartao, BigDecimal valor) {
        if (cartao.startsWith("2222") && valorMaiorQueLimite(valor)) {
            throw new IllegalArgumentException("Limite do cartão excedido.");
        }

        this.codigoConfirmacao = (long) Math.random() * 360;
    }

    private boolean valorMaiorQueLimite(BigDecimal valor) {
        BigDecimal limite = new BigDecimal("1000");
        return valor.compareTo(limite) > 0;
    }

    @Override
    public Long confirmar() {
        System.out.println("Debitando a conta cliente via Cielo.");
        return this.codigoConfirmacao;
    }

}
