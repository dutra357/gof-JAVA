package org.example.proxy.exercicioProxy.accesProxy;

import org.example.proxy.exercicioProxy.serviceMail.MailSender;
import org.example.proxy.exercicioProxy.serviceMail.ServiceMailSender;

import java.util.Arrays;

public class ServiceProxy implements MailSender {


    private final String[] emails;

    public ServiceProxy(String... emails) {
        this.emails = emails;
    }


    @Override
    public void sendMail(String mensagem) {
        ServiceMailSender emailSender = new ServiceMailSender(
                filtroListaNegra(this.emails)
        );

        emailSender.sendMail(mensagem);

    }

    private String[] filtroListaNegra(String... emails) {
        return Arrays.stream(emails)
                .filter(email -> !email.contains("maria@gmail.com"))
                .toArray(String[]::new);
    }
}
