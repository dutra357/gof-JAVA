package org.example.Observer.observable.interfaces;

import org.example.Observer.entidades.Lancamento;
import org.example.Observer.listeners.interfaces.Listener;

import java.util.List;

public interface Notificador {

    void registrarListener(Listener listener);

    void removerListener(Listener listener);

    void notificarListeners();
    void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos);
}
