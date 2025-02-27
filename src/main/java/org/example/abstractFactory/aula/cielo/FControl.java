package org.example.abstractFactory.aula.cielo;

import org.example.abstractFactory.aula.interfaces.GestorDeRisco;

import java.math.BigDecimal;

public class FControl implements GestorDeRisco {
    @Override
    public void avaliarRisco(String cartao, BigDecimal valor) {
        if (cartao.startsWith("7777")) {
            throw new IllegalArgumentException("Cartão suspeito.");
        }
    }
}
