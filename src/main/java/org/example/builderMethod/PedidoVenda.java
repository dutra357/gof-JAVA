package org.example.builderMethod;

import java.util.ArrayList;
import java.util.List;

public class PedidoVenda {

    private String numero;
    private Client client;
    private final List<ItemPedido> itensPedido = new ArrayList<>();

    public PedidoVenda(String numero, Client client) {
        this.numero = numero;
        this.client = client;
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
