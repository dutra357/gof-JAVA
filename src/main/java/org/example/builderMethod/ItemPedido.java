package org.example.builderMethod;

import java.math.BigDecimal;

public class ItemPedido {
    private String name;
    private Integer quantidade;
    private BigDecimal valorUnitario;

    public ItemPedido() {}
    public ItemPedido(String name, int quantidade, BigDecimal valorUnitario) {
        this.name = name;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
