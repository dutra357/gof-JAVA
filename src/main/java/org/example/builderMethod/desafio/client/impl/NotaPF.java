package org.example.builderMethod.desafio.client.impl;

import org.example.builderMethod.desafio.factory.NotaFiscal;
import org.example.builderMethod.desafio.factory.interfaces.Calculo;


public class NotaPF extends NotaFiscal {

    @Override
    public Calculo calcularImposto() {
        return new CalculoPF();
    }
}
