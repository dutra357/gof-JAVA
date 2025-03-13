package org.example.proxy.desafio.serviceMail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceMailSender implements MailSender{

    private static final Logger logger = LoggerFactory.getLogger(ServiceMailSender.class);

    private List<String> emails;

    public ServiceMailSender(String... emails) {
        this.emails = new ArrayList<>(Arrays.asList(emails));
    }


    @Override
    public void sendMail(String mensagem) {

        for (String email : this.emails) {
            logger.info("E-mail enviado para: [{}] - msg: {}", email, mensagem);
        }

    }
}
