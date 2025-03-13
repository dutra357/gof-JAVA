package org.example.proxy.desafio;

import org.example.proxy.desafio.accesProxy.ServiceProxy;
import org.example.proxy.desafio.serviceMail.MailSender;

public class Principal {

    public static void main(String[] args) {

        MailSender mailSender = new ServiceProxy("jose@gmail.com", "maria@gmail.com", "laura@gmail.com");
        mailSender.sendMail("Teste de msg!");

    }
}
