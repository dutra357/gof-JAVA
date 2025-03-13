package org.example.Observer.entidades;

public enum TipoLancamento {

    DESPESA("Despesa"),
    RECEITA("Receita");

    private String descricao;

    TipoLancamento(String descricao) {
        this.descricao = descricao;
    }
}
