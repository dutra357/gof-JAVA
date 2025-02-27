package org.example.abstractFactory.aula.factory;

import org.example.abstractFactory.aula.pagamentos.cielo.Cielo;
import org.example.abstractFactory.aula.pagamentos.cielo.FControl;
import org.example.abstractFactory.aula.factory.interfaces.ModuloPagamentoFactory;
import org.example.abstractFactory.aula.pagamentos.interfaces.GestorDeRisco;
import org.example.abstractFactory.aula.pagamentos.interfaces.Operadora;

public class PagSeguroFactory implements ModuloPagamentoFactory {


    @Override
    public Operadora criarOperadora() {
        return new Cielo();
    }

    @Override
    public GestorDeRisco criarGestorDeRisco() {
        return new FControl();
    }
}
