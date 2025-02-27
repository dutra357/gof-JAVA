package org.example.abstractFactory.aula.interfaces;

import java.math.BigDecimal;

public interface Operadora {

    void capturar(String cartao, BigDecimal valor);
    Long confirmar();
}
