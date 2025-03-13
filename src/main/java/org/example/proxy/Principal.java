package org.example.proxy;

import org.example.proxy.proxyControl.ContatosXMLProxy;
import org.example.proxy.resource.interfaces.Contatos;

public class Principal {

    public static void main(String[] args) {


        /**
         * O padrão PROXY fornece um substituto ou marcador de localização
         * de outro objeto para controlar o acesso a ele.
         */

        Contatos contatos = new ContatosXMLProxy("contatos1.xml", "contatos2.xml");
        String nome = contatos.buscarPor("jose@gmail.com");

        System.out.println(nome);
    }
}
