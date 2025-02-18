package org.example.factoryMethod.client;

import org.example.factoryMethod.lib.MalaDireta;
import org.example.factoryMethod.lib.interfaces.Contatos;

public class MalaDiretaXML extends MalaDireta {

    private String nomeArquivo;
    public MalaDiretaXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(nomeArquivo);
    }
}
