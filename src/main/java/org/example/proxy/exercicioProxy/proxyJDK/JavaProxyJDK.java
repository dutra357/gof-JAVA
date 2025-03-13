package org.example.proxy.exercicioProxy.proxyJDK;

import java.lang.reflect.Proxy;

public class JavaProxyJDK {

    public static <T> T criarProxy(T alvo, Class<T> tipoInterface) {
        return (T) Proxy.newProxyInstance(
                tipoInterface.getClassLoader(),
                new Class<?>[] { tipoInterface },
                new SenderInvocationHandler(alvo)
        );
    }
}
