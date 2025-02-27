package org.example.builderMethod;

import org.example.builderMethod.desafio.builder.NotaFiscalBuilder;
import org.example.builderMethod.desafio.factory.NotaFiscal;

public class Principal {

    public static void main(String[] args) {

        /**
         * Desafio - Builder
         *
         * O padrão Builder permite a criação passo a passo de objetos complexos
         * usando uma sequência de ações. A construção é controlada por um objeto
         * diretor que apenas precisa conter o tipo do objeto que deve ser criado.
         */
        NotaFiscal notaFiscal = new NotaFiscalBuilder("PF")
                .comNumero("123456789-0")
                .comDataString("10/10/2024")
                .comItemPedidoValorString("Televisão LCD", 1, "1000.00")
                .builder();

        System.out.println(notaFiscal.calcular());
    }
}
