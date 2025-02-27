package org.example.abstractFactory.aula.factory;

import org.example.abstractFactory.aula.factory.interfaces.ModuloPagamentoFactory;
import org.example.abstractFactory.aula.pagamentos.interfaces.GestorDeRisco;
import org.example.abstractFactory.aula.pagamentos.interfaces.Operadora;
import org.example.abstractFactory.aula.pagamentos.paypal.ClearSale;
import org.example.abstractFactory.aula.pagamentos.paypal.RedeCard;

public class PayPalFactory implements ModuloPagamentoFactory {


    @Override
    public Operadora criarOperadora() {
        return new RedeCard();
    }

    @Override
    public GestorDeRisco criarGestorDeRisco() {
        return new ClearSale();
    }
}
