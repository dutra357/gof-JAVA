package org.example.abstractFactory.aula.factory.interfaces;

import org.example.abstractFactory.aula.pagamentos.interfaces.GestorDeRisco;
import org.example.abstractFactory.aula.pagamentos.interfaces.Operadora;

public interface ModuloPagamentoFactory {

    public Operadora criarOperadora();
    public GestorDeRisco criarGestorDeRisco();
}
