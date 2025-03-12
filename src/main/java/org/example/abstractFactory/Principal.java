package org.example.abstractFactory;

import org.example.abstractFactory.aula.Pagamento;
import org.example.abstractFactory.aula.factory.PagSeguroFactory;
import org.example.abstractFactory.aula.factory.PayPalFactory;
import org.example.abstractFactory.aula.factory.interfaces.ModuloPagamentoFactory;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {

        /**
         * Aula - AbstractFactory
         *
         * O padrão AbstractFactory fornece uma interface para criar famílias de objetos relacionados
         * ou dependentes, sem especificar suas classes correlatas.
         */
        ModuloPagamentoFactory moduloPayPal = new PayPalFactory();
        Pagamento pagamentoPayPal = new Pagamento(moduloPayPal);

        pagamentoPayPal.autorizar("7777", new BigDecimal("1000"));

    }
}
