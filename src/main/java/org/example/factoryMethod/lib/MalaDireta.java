package org.example.factoryMethod.lib;


import org.example.factoryMethod.lib.interfaces.Contatos;

import java.util.List;

public abstract class MalaDireta {

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



}
