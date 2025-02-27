package org.example.factoryMethod.client;

import org.example.factoryMethod.lib.MalaDireta;
import org.example.factoryMethod.lib.interfaces.Contatos;

public class MalaDiretaCSV extends MalaDireta {

    private String nomeArquivo;
    public MalaDiretaCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(nomeArquivo);
    }
}
