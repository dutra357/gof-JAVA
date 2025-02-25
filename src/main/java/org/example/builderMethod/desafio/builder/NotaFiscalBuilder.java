package org.example.builderMethod.desafio.builder;

import org.example.builderMethod.desafio.client.ItemProduto;
import org.example.builderMethod.desafio.client.impl.NotaPF;
import org.example.builderMethod.desafio.client.impl.NotaPJ;
import org.example.builderMethod.desafio.factory.NotaFiscal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NotaFiscalBuilder {

    private NotaFiscal notaFiscal;

    public NotaFiscalBuilder(String tipo) {
        if (tipo.equals("PJ")) {
            this.notaFiscal = new NotaPJ();
        } else if (tipo.equals("PF")) {
            this.notaFiscal = new NotaPF();
        }
    }

    public NotaFiscalBuilder comNumero(String numero) {
        this.notaFiscal.setNumero(numero);
        return this;
    }

    public NotaFiscalBuilder comDataString(String data) {
        formataData(data);
        return this;
    }

    public NotaFiscalBuilder comDataLocalDate(LocalDate data) {
        this.notaFiscal.setData(data);
        return this;
    }

    public NotaFiscalBuilder comItemPedidoValorBigDecimal(String nome, Integer quantidade, BigDecimal valor) {
        ItemProduto itemProduto = new ItemProduto(nome, quantidade, valor);
        this.notaFiscal.getItensProduto().add(itemProduto);
        return this;
    }

    public NotaFiscalBuilder comItemPedidoValorString(String nome, Integer quantidade, String valor) {
        ItemProduto itemProduto = new ItemProduto(nome, quantidade, converteBigDecimal(valor));
        this.notaFiscal.getItensProduto().add(itemProduto);
        return this;
    }

    public NotaFiscal builder() {
        return this.notaFiscal;
    }

    private void formataData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.notaFiscal.setData(LocalDate.parse(data, formatter));
    }

    private BigDecimal converteBigDecimal(String valor) {
        return new BigDecimal(valor);
    }
}
