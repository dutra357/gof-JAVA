package org.example.builderMethod.builder;

import org.example.builderMethod.aula.Client;
import org.example.builderMethod.aula.ItemPedido;
import org.example.builderMethod.aula.PedidoVenda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class PedidoVendaTest {

    @Test
    void deveCalcularValorTotalDoPedidoParaClienteVip() {

        PedidoVenda pedidoVenda = new PedidoVenda();
        Client client = new Client();

        client.setName("Antonio");
        client.setVip(true);
        pedidoVenda.setClient(client);

        ItemPedido item01 = new ItemPedido();
        item01.setName("PC Gamer");
        item01.setValorUnitario(new BigDecimal("200"));
        item01.setQuantidade(2);

        ItemPedido item02 = new ItemPedido();
        item02.setName("Livro - Senhor dos Anéis");
        item02.setValorUnitario(new BigDecimal("200"));
        item02.setQuantidade(1);

        List<ItemPedido> itemPedidos = Arrays.asList(item01, item02);
        pedidoVenda.getItensPedido().addAll(itemPedidos);

        Assertions.assertEquals(new BigDecimal("576.00"), pedidoVenda.calcularValorTotal());
    }

    @Test
    void deveCalcularValorTotalDoPedidoParaClienteVipComBuilder() {

        PedidoVenda pedidoVenda = new PedidoBuilder()
                .comClienteVip("Antonio")
                .comItem("PC Gamer",2, new BigDecimal("200"))
                .comItem("Livro - Senhor dos Anéis",1, new BigDecimal("200"))
                .builder();

        Assertions.assertEquals(new BigDecimal("576.00"), pedidoVenda.calcularValorTotal());
    }
}