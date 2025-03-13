package org.example.proxy;

import org.example.proxy.proxyControl.ContatosXMLProxy;
import org.example.proxy.resource.interfaces.Contatos;

public class Principal {

    public static void main(String[] args) {


        /**
         * O padrão PROXY fornece um substituto ou marcador de localização
         * de outro objeto para controlar o acesso a ele.
         *
         * A presente implementação do pattern permite o controle de acesso
         * da classe ContatosXML, de modo que o carregamento dos arquivos XML
         * passam a ser individuais, e não mais carrega todos os arquivos de uma só vez.
         *
         * Útil para evitar o carregamento de muitos arquivos, notadamente
         * no caso de alguns ou vários serem de tamanho expressivo ou com
         * grande quantidade de dados.
         *
         */

        Contatos contatos = new ContatosXMLProxy("contatos1.xml", "contatos2.xml");
        String nome = contatos.buscarPor("jose@gmail.com");

        System.out.println(nome);
    }
}
