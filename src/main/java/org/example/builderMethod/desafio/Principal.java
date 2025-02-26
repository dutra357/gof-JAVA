package org.example.builderMethod.desafio;

import org.example.builderMethod.desafio.builder.NotaFiscalBuilder;
import org.example.builderMethod.desafio.factory.NotaFiscal;

public class Principal {

    public static void main(String[] args) {

        NotaFiscal notaFiscal = new NotaFiscalBuilder("PF")
                .comNumero("123456789-0")
                .comDataString("10/10/2024")
                .comItemPedidoValorString("Televisão LCD", 1, "1000.00")
                .builder();

        System.out.println(notaFiscal.calcular());
    }
}
