package org.example.proxy.exercicioProxy.proxyJDK;

import org.example.proxy.exercicioProxy.serviceMail.ServiceMailSender;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SenderInvocationHandler implements InvocationHandler {

    private final Object alvo;

    public SenderInvocationHandler(Object alvo) {
        this.alvo = alvo;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (alvo instanceof ServiceMailSender) {
            var mailSenderAddresses = (ServiceMailSender) alvo;
            mailSenderAddresses.addEmails(filtroListaNegra(Arrays.asList("jose@gmail.com", "maria@gmail.com", "laura@gmail.com")));
        }

        Object object = method.invoke(alvo, args);

        return object;
    }

    private List filtroListaNegra(List emails) {
        return emails
                .stream()
                .filter(email -> !email.equals("maria@gmail.com"))
                .toList();
    }
}
