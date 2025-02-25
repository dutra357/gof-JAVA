package org.example.factoryMethod.desafio;

import org.example.factoryMethod.desafio.client.Logger;
import org.example.factoryMethod.desafio.factory.MyLogger;


public class CalculadoraDeImpostos {

    private final MyLogger logger;
    public CalculadoraDeImpostos(MyLogger logger) {
        this.logger = logger;
    }

    public void calcular(double valor) {
        // Aqui teria uma lógica para calcular impostos sobre o valor passado
        // no fim, o programador gostaria de deixar registrado o valor calculado
        logger.log("Minha mensagem ou método a ser logado!, calculando: " + valor);
    }


    public static void main(String[] args) {
        MyLogger logger = new Logger();
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos(logger);
        calc.calcular(10);

    }

}
