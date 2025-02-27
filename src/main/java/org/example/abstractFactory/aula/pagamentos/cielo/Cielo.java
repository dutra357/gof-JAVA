package org.example.abstractFactory.aula.pagamentos.cielo;

import org.example.abstractFactory.aula.pagamentos.interfaces.Operadora;

import java.math.BigDecimal;

public class Cielo implements Operadora {

    private Long codigoConfirmacao = -1L;

    @Override
    public void capturar(String cartao, BigDecimal valor) {
        if (cartao.startsWith("5555")) {
            throw new IllegalArgumentException("Número do cartão inválido");
        }
    }

    @Override
    public Long confirmar() {
        System.out.println("Debitando a conta cliente via Cielo.");
        return this.codigoConfirmacao;
    }

}
