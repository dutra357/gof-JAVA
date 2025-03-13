package org.example.Observer;

import org.example.Observer.listeners.EmailListener;
import org.example.Observer.listeners.SmsListener;
import org.example.Observer.listeners.interfaces.Listener;
import org.example.Observer.observable.NotificadorLancamentosVencidos;
import org.example.Observer.observable.interfaces.Notificador;
import org.example.Observer.repositorios.Lancamentos;
import org.quartz.JobDataMap;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class Principal {

    public static void main(String[] args) throws SchedulerException {

        /**
         * Pattern Observer: Define uma dependência 'um para muitos'
         * entre objetos, de modo que, quando um objeto muda de estado,
         * todos os seus dependentes são automaticamente notificados e
         * atualizados.
         *
         * Observado (observable) / Observadores (observers)
         *
         * Também conhecido como 'Dependents'.
         */

        Notificador notificador = new NotificadorLancamentosVencidos();

        Listener enviadorEmail = new EmailListener();
        Listener enviadorSms = new SmsListener();

        JobDataMap jobDataMap = new JobDataMap();

        Lancamentos lancamentos = new Lancamentos();

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("lancamentos", lancamentos);
        jobDataMap.put("notificador", notificador);
    }
}
