package org.example.builderMethod.desafio.factory;

import org.example.builderMethod.desafio.client.ItemProduto;
import org.example.builderMethod.desafio.factory.interfaces.Calculo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class NotaFiscal {

    private String numero;
    private LocalDate data;
    private final List<ItemProduto> itensProduto = new ArrayList<>();

    public NotaFiscal() {}
    public NotaFiscal(String numero, LocalDate data) {
        this.numero = numero;
        this.data = data;
    }

    protected abstract Calculo calcularImposto();
    public BigDecimal calcular() {
        return calcularImposto().calcular(this.itensProduto);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<ItemProduto> getItensProduto() {
        return itensProduto;
    }
}
