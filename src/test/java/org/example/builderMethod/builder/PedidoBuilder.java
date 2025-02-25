package org.example.builderMethod.builder;

import org.example.builderMethod.Client;
import org.example.builderMethod.ItemPedido;
import org.example.builderMethod.PedidoVenda;

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

    private void montarCliente(String name, boolean vip) {
        Client client = new Client();
        client.setName(name);
        client.setVip(vip);
        this.pedidoVenda.setClient(client);
    }

    public PedidoBuilder comItem(String nome, Integer quantidade, BigDecimal valorUnitario) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setName(nome);
        itemPedido.setValorUnitario(valorUnitario);
        itemPedido.setQuantidade(quantidade);

        this.pedidoVenda.getItensPedido().add(itemPedido);
        return this;
    }

    public PedidoVenda builder() {
        return this.pedidoVenda;
    }
}
