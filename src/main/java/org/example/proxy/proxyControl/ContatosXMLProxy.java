package org.example.proxy.proxyControl;

import org.example.proxy.resource.ContatosXML;
import org.example.proxy.resource.interfaces.Contatos;

import java.util.*;

public class ContatosXMLProxy implements Contatos {


    private List<String> nomesArquivos;
    private ContatosXML contatosXML;

    public ContatosXMLProxy(String... nomesArquivos) {
        this.nomesArquivos = new ArrayList<>(Arrays.asList(nomesArquivos));
    }

    @Override
    public String buscarPor(String email) {
        Random random = new Random();
        String nome = null;

        int qtdArquivos = nomesArquivos.size();

        for (int i = 0; i < qtdArquivos; i++) {
            int index = random.nextInt(nomesArquivos.size());

            String nomeArquivo = nomesArquivos.remove(index);
            this.contatosXML = new ContatosXML(nomeArquivo);

            nome = this.contatosXML.buscarPor(email);
            if (nome != null) break;
        }


        return nome;
    }
}
