package org.example.Observer.entidades;

import org.example.Observer.observable.interfaces.Notificador;
import org.example.Observer.repositorios.Lancamentos;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.List;

public class LancamentosVencidosJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();

        Lancamentos lancamentos = (Lancamentos) jobDataMap.get("lancamentos");
        Notificador notificador = (Notificador) jobDataMap.get("notificador");

        List<Lancamento> lancamentosVencidos = lancamentos.todosVencidos();
        notificador.novosLancamentosVencidos(lancamentosVencidos);
    }
}
