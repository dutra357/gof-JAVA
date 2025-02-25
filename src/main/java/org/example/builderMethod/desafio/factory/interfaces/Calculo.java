package org.example.builderMethod.desafio.factory.interfaces;

import org.example.builderMethod.desafio.client.ItemProduto;

import java.math.BigDecimal;
import java.util.List;

public interface Calculo {

    BigDecimal calcular(List<ItemProduto> itensProduto);
}
