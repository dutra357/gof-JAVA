package org.example.builderMethod.desafio.client.impl;

import org.example.builderMethod.desafio.client.ItemProduto;
import org.example.builderMethod.desafio.factory.interfaces.Calculo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

public class CalculoPF implements Calculo {

    @Override
    public BigDecimal calcular(List<ItemProduto> itensProduto) {
        BigDecimal total = BigDecimal.ZERO;

        for (ItemProduto item : itensProduto) {
            total = total.add((item.getValor().multiply(new BigDecimal(item.getQuantidade()))));
        }

        return total.multiply(new BigDecimal("0.07"), new MathContext(2));
    }
}
