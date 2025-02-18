package org.example.factoryMethod.client;

import com.thoughtworks.xstream.XStream;
import org.example.factoryMethod.lib.Contato;
import org.example.factoryMethod.lib.interfaces.Contatos;

import java.net.URL;
import java.util.List;

public class ContatosXML implements Contatos {

    private String nomeArquivo;
    public ContatosXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Contato> todos() {
        XStream xstream = new XStream();
        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);

        URL arquivo = this.getClass().getResource("/src/" + nomeArquivo);

        return (List<Contato>) xstream.fromXML(arquivo);
    }
}
