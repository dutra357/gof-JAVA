package org.example.factoryMethod;

import org.example.factoryMethod.client.MalaDiretaCSV;
import org.example.factoryMethod.client.MalaDiretaXML;
import org.example.factoryMethod.lib.MalaDireta;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        /**
         * Aula - FactoryMethod
         *
         * O padrão FactoryMethod define uma interface para criar um objeto,
         * mas permite que as classes que a implementam decidam qual classe instanciar.
         *
         * FactoryMethod permite uma classe delegar a sua instanciação à subclasse.
         */
        MalaDireta malaDiretaCSV = new MalaDiretaCSV("contatos.csv");
        MalaDireta malaDiretaXML = new MalaDiretaXML("contatos.xml");

        String mensagem = JOptionPane.showInputDialog(null, "Digite a msg do e-mail: ");
        boolean status = malaDiretaCSV.enviarEmail(mensagem);

    }
}
