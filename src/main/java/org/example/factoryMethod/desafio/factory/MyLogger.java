package org.example.factoryMethod.desafio.factory;

import org.example.factoryMethod.desafio.factory.interfaces.PrintLogger;

public abstract class MyLogger {

    protected abstract PrintLogger printLogger();

    void log(Message message) {
        
        printLogger().print(message);
    }


}
