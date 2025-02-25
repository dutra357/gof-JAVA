package org.example.factoryMethod.desafio;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraDeImpostos {

    private Logger logger;
    public CalculadoraDeImpostos(Logger logger) {
        this.logger = logger;
    }

    public void calcular(double valor) {
        // Aqui teria uma lógica para calcular impostos sobre o valor passado
        // no fim, o programador gostaria de deixar registrado o valor calculado
        logger.log(Level.WARNING, "Imposto calculado para o valor R$" + valor);
    }

}
