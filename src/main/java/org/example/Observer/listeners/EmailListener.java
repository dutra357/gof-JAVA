package org.example.Observer.listeners;

import org.example.Observer.entidades.Lancamento;
import org.example.Observer.listeners.interfaces.Listener;

import java.util.List;

public class EmailListener implements Listener {


    @Override
    public void atualizar(List<Lancamento> lancamentosVencidos) {
        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando e-mail para: " + lancamento.getPessoa().getNome());
        }
    }
}
