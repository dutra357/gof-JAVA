package org.example.factoryMethod;

import org.example.factoryMethod.client.MalaDiretaCSV;
import org.example.factoryMethod.client.MalaDiretaXML;
import org.example.factoryMethod.lib.MalaDireta;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        MalaDireta malaDiretaCSV = new MalaDiretaCSV("contatos.csv");
        MalaDireta malaDiretaXML = new MalaDiretaXML("contatos.xml");

        String mensagem = JOptionPane.showInputDialog(null, "Digite a msg do e-mail: ");

        boolean status = malaDiretaXML.enviarEmail(mensagem);

        JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
}
