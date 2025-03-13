package org.example.proxy.proxyControl;

import com.thoughtworks.xstream.XStream;
import org.example.proxy.resource.Contato;
import org.example.proxy.resource.interfaces.Contatos;

import java.util.*;

public class ContatosXMLProxy implements Contatos {


    private List<String> nomesArquivos;
    public ContatosXMLProxy(String... nomesArquivos) {
        this.nomesArquivos = new ArrayList<>(Arrays.asList(nomesArquivos));

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
        return "";
    }
}
