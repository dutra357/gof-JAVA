package org.example.proxy.exercicioProxy;

import org.example.proxy.exercicioProxy.accesProxy.ServiceProxy;
import org.example.proxy.exercicioProxy.proxyJDK.JavaProxyJDK;
import org.example.proxy.exercicioProxy.serviceMail.MailSender;
import org.example.proxy.exercicioProxy.serviceMail.ServiceMailSender;

public class Principal {

    public static void main(String[] args) {

        MailSender mailSender = new ServiceProxy("jose@gmail.com", "maria@gmail.com", "laura@gmail.com");

        /**
         * ProxyFactory da JDK com uso de Reflections
         */
        MailSender realMailSender = new ServiceMailSender();
        MailSender mailSenderJDK = JavaProxyJDK.criarProxy(realMailSender, MailSender.class);


        // # Resultados
        mailSender.sendMail("Teste de msg com proxy básico!");
        System.out.println("---------------------------------------");
        mailSenderJDK.sendMail("Teste de msg utilizando ProxyJDK!");

    }
}
