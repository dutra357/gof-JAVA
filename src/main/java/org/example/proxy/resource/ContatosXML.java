package org.example.proxy.resource;

import com.thoughtworks.xstream.XStream;
import org.example.proxy.resource.interfaces.Contatos;

import java.util.*;

public class ContatosXML implements Contatos {

    private Map<String, String> contatosEmCache = new HashMap<>();

    public ContatosXML(String... nomesArquivos) {

        XStream xStream = new XStream();
        xStream.allowTypes(new Class[] { Contato.class });

        xStream.alias("contatos", List.class);
        xStream.alias("contato", Contato.class);

        for (String nomeArquivo : nomesArquivos) {
            System.out.println("Carregando arquivo: " + nomeArquivo);

            List<Contato> contatosCarregados = (List<Contato>) xStream
                    .fromXML(this.getClass().getResource("/src/" + nomeArquivo));

            for (Contato contato : contatosCarregados) {
                contatosEmCache.put(contato.getEmail(), contato.getNome());
            }
        }
    }

    @Override
    public String buscarPor(String email) {
        return contatosEmCache.get(email);
    }
}
