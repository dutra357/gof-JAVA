package org.example.Observer.listeners.interfaces;

import org.example.Observer.entidades.Lancamento;

import java.util.List;

public interface Listener {

    void atualizar(List<Lancamento> lancamentosVencidos);
}
