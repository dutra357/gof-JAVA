package org.example.factoryMethod.client;

import au.com.bytecode.opencsv.CSVReader;
import org.example.factoryMethod.lib.Contato;
import org.example.factoryMethod.lib.MalaDireta;
import org.example.factoryMethod.lib.interfaces.Contatos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContatosCSV implements Contatos {

    private static final Logger logger = Logger.getLogger(ContatosCSV.class.getName());
    private String nomeArquivo;
    public ContatosCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public List<Contato> todos() {
        List<Contato> contatos = new ArrayList<>();
        CSVReader csvReader = null;

        try {
            URI uri = this.getClass().getResource("/src/" + nomeArquivo).toURI();

            File arquivoCsv = new File(uri);
            FileReader fileReader = new FileReader(arquivoCsv);
            csvReader = new CSVReader(fileReader);
            String [] nextLine;

            while ((nextLine = csvReader.readNext()) != null) {
                contatos.add(new Contato(nextLine[0].trim(), nextLine[1].trim()));
            }
        } catch (Exception e) {

            //Log pegando a exception
            logger.log(Level.WARNING,"Erro lendo arquivo csv", e);
            throw new RuntimeException("Erro lendo arquivo csv", e);

        } finally {
            try {
                csvReader.close();
            } catch (IOException e) { }
        }

        return contatos;
    }
}
