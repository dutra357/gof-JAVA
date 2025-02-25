package org.example.factoryMethod.lib;


import org.example.factoryMethod.lib.interfaces.Contatos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public abstract class MalaDireta {
    private static final Logger logger = LoggerFactory.getLogger(MalaDireta.class);


    protected abstract Contatos criarContatos();
    public boolean enviarEmail(String mensagem) {

        List<Contato> contatos = criarContatos().todos();

        System.out.println("Conectando no servidor SMTP...");
        System.out.println("Mensagem a ser enviada: " + mensagem);
        System.out.println();

        for (Contato contato : contatos) {
            System.out.println("From: <dutra@teste.com>");
            System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());

            System.out.println(mensagem);
            System.out.println();
        }

        return true;
    }

    private void metodo(String... varargs) {
        System.out.println(varargs);

        Map<String, Long> myWeak = new WeakHashMap<>();
        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();

        //Log simples, concatenando strings
        //Para Logger java: -Djava.util.logging.config.file=logging.properties
        logger.trace("Estou aqui com LogBack TRACE!");
        logger.info("Estou aqui com LogBack INFO!");
        logger.debug("Estou aqui com LogBack DEBUG!");
        logger.warn("Estou aqui com LogBack WARN!");
        logger.error("Estou aqui com LogBack ERROR!");

        Long numero1 = 128L;
        Long numero2 = 128L;
        System.out.println(numero1 == numero2);
        List<String> teste = new ArrayList<>();

        System.out.println(Runtime.getRuntime().totalMemory());
    }

}
