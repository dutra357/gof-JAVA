package org.example.Observer.observable;

import org.example.Observer.entidades.Lancamento;
import org.example.Observer.listeners.interfaces.Listener;
import org.example.Observer.observable.interfaces.Notificador;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificadorLancamentosVencidos implements Notificador {

    private Set<Listener> listenerSet;
    private List<Lancamento> lancamentosVencidos;

    public NotificadorLancamentosVencidos() {
        this.listenerSet = new HashSet<>();
    }

    @Override
    public void registrarListener(Listener listener) {
        this.listenerSet.add(listener);
    }

    @Override
    public void removerListener(Listener listener) {
        this.listenerSet.remove(listener);
    }

    @Override
    public void notificarListeners() {
        for (Listener listener : listenerSet) {
            listener.atualizar(lancamentosVencidos);
        }
    }

    @Override
    public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos) {
        this.lancamentosVencidos = lancamentosVencidos;
        this.notificarListeners();
    }
}
