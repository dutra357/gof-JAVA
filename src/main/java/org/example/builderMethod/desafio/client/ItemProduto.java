package org.example.builderMethod.desafio.client;

import java.math.BigDecimal;

public class ItemProduto {

    private String nome;
    private Integer quantidade;
    private BigDecimal valor;

    public ItemProduto() {}
    public ItemProduto(String nome, Integer quantidade, BigDecimal valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
