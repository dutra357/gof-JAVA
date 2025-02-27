package org.example.abstractFactory.aula.pagamentos.interfaces;

import java.math.BigDecimal;

public interface GestorDeRisco {

    public void avaliarRisco(String cartao, BigDecimal valor);
}
