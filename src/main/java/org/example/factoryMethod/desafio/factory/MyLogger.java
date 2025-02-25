package org.example.factoryMethod.desafio.factory;

import org.example.factoryMethod.desafio.factory.interfaces.PrintLogger;

public abstract class MyLogger {

    protected abstract PrintLogger printLogger();

    public void log(String message) {
        printLogger().print(message);
    }


}
