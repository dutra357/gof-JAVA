package org.example.Observer.listeners;

import org.example.Observer.entidades.Lancamento;
import org.example.Observer.listeners.interfaces.Listener;
import org.example.Observer.observable.interfaces.Notificador;

import java.util.List;

public class SmsListener implements Listener {

    private Notificador notificador;

    public SmsListener(Notificador notificador) {
        this.notificador = notificador;
        notificador.registrarListener(this);
    }

    @Override
    public void atualizar(List<Lancamento> lancamentosVencidos) {
        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando SMS para: " + lancamento.getPessoa().getNome());
        }

        //Possibilidade de se desregistrar após notificação
        //this.notificador.removerListener(this);
    }
}
