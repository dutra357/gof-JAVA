package org.example.factoryMethod.desafio.client;

import org.example.factoryMethod.desafio.factory.interfaces.PrintLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerConsole implements PrintLogger {

    private static final Logger logger = LoggerFactory.getLogger(LoggerConsole.class);

    @Override
    public void print(String message) {
        logger.info(message);
    }
}
