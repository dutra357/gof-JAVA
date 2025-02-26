package org.example.builderMethod.aula;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PedidoVenda {

    private String numero;
    private Client client;
    private final List<ItemPedido> itensPedido = new ArrayList<>();

    public PedidoVenda() {}
    public PedidoVenda(String numero, Client client) {
        this.numero = numero;
        this.client = client;
    }

    public BigDecimal calcularValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemPedido item : itensPedido) {
            valorTotal = valorTotal.add(item.getValorUnitario()).multiply(new BigDecimal(item.getQuantidade()));
        }

        if (client.isVip()) {
            valorTotal = valorTotal.multiply(new BigDecimal("0.96"));
        }

        return valorTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }
}
