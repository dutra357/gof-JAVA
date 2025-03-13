package org.example.Observer.entidades;

import org.example.Observer.observable.interfaces.Notificador;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.List;

public class LancamentosVencidosJob implements Job {

    List<Lancamento> lancamentosVencidos = lancamentos.todosVencidos();

    Notificador notificador = null;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }
}
