package org.example.factoryMethod.desafio.client;

import org.example.factoryMethod.desafio.factory.MyLogger;
import org.example.factoryMethod.desafio.factory.interfaces.PrintLogger;

public class Logger extends MyLogger {

    @Override
    protected PrintLogger printLogger() {
        return new LoggerConsole();
    }
}
