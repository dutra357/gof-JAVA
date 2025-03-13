package org.example.Observer.services;

import org.example.Observer.entidades.Lancamento;

import java.util.List;

public class EnviadorEmail {

    public void enviar(List<Lancamento> lancamentosVencidos) {
        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando e-mail para: " + lancamento.getPessoa().getNome());
        }
    }
}
