package org.example.builderMethod.builder;

import org.example.builderMethod.aula.Client;
import org.example.builderMethod.aula.ItemPedido;
import org.example.builderMethod.aula.PedidoVenda;

import java.math.BigDecimal;

public class PedidoBuilder {

    private PedidoVenda pedidoVenda;
    public PedidoBuilder() {
        this.pedidoVenda = new PedidoVenda();
    }

    public PedidoBuilder comClienteVip(String nome) {
        montarCliente(nome, true);
        return this;
    }

    public PedidoBuilder semClienteVip(String nome) {
        montarCliente(nome, false);
        return this;
    }

    public PedidoBuilder comItem(String nome, Integer quantidade, BigDecimal valorUnitario) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setName(nome);
        itemPedido.setValorUnitario(valorUnitario);
        itemPedido.setQuantidade(quantidade);

        this.pedidoVenda.getItensPedido().add(itemPedido);
        return this;
    }

    private void montarCliente(String name, boolean vip) {
        Client client = new Client();
        client.setName(name);
        client.setVip(vip);
        this.pedidoVenda.setClient(client);
    }

    public PedidoVenda builder() {
        return this.pedidoVenda;
    }
}
