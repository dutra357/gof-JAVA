package org.example.builderMethod.desafio.client;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private String numero;
    private LocalDate data;
    private final List<ItemProduto> itensProduto = new ArrayList<>();

    public NotaFiscal() {}
    public NotaFiscal(String numero, LocalDate data) {
        this.numero = numero;
        this.data = data;
    }

    public BigDecimal calcularImposto() {
        BigDecimal total = BigDecimal.ZERO;

        for (ItemProduto item : this.itensProduto) {
            total = total.add((item.getValor().multiply(new BigDecimal(item.getQuantidade()))));
        }

        return total.multiply(new BigDecimal("0.04"), new MathContext(2));
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
