package org.example.abstractFactory.aula.pagamentos.paypal;

import org.example.abstractFactory.aula.pagamentos.interfaces.GestorDeRisco;

import java.math.BigDecimal;

public class ClearSale implements GestorDeRisco {

    @Override
    public void avaliarRisco(String cartao, BigDecimal valor) {
        if (cartao.startsWith("1111") && valorMuitoAlto(valor)) {
            throw new IllegalArgumentException("Limite excedido.");
        }
    }

    private boolean valorMuitoAlto(BigDecimal valor) {
        BigDecimal limite = new BigDecimal("5000");
        return limite.compareTo(valor) < 0;
    }
}
