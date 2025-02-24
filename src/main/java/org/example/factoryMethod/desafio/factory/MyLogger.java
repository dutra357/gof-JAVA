package org.example.factoryMethod.desafio.factory;

import org.slf4j.Logger;

public abstract class MyLogger {

    Logger logger;

    public MyLogger(Logger logger) {
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
