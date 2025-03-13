package org.example.Observer.listeners;

import org.example.Observer.entidades.Lancamento;
import org.example.Observer.listeners.interfaces.Listener;
import org.example.Observer.observable.interfaces.Notificador;

import java.util.List;

public class EmailListener implements Listener {

    private Notificador notificador;

    public EmailListener(Notificador notificador) {
        this.notificador = notificador;
        notificador.registrarListener(this);
    }

    @Override
    public void atualizar(List<Lancamento> lancamentosVencidos) {
        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando e-mail para: " + lancamento.getPessoa().getNome());
        }

        //Possibilidade de se desregistrar após notificação
        //this.notificador.removerListener(this);
    }
}
