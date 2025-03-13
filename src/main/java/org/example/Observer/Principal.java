package org.example.Observer;

import org.example.Observer.entidades.LancamentosVencidosJob;
import org.example.Observer.listeners.EmailListener;
import org.example.Observer.listeners.SmsListener;
import org.example.Observer.listeners.interfaces.Listener;
import org.example.Observer.observable.NotificadorLancamentosVencidos;
import org.example.Observer.observable.interfaces.Notificador;
import org.example.Observer.repositorios.Lancamentos;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class Principal {

    public static void main(String[] args) throws SchedulerException, InterruptedException {

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

        Listener enviadorEmail = new EmailListener(notificador);
        Listener enviadorSms = new SmsListener(notificador);

        JobDataMap jobDataMap = new JobDataMap();

        Lancamentos lancamentos = new Lancamentos();

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("lancamentos", lancamentos);
        jobDataMap.put("notificador", notificador);

        JobDetail job = newJob(LancamentosVencidosJob.class)
                .setJobData(jobDataMap)
                .withIdentity("lancamentosVencidosJob", "lancamentosVencidosGroup")
                .build();

        CronTrigger trigger = newTrigger()
                .withIdentity("trigger01", "group01")
                .withSchedule(cronSchedule("0 * * * * ?"))
                .build();

        scheduler.scheduleJob(job, trigger);

        scheduler.start();

        Thread.sleep(22000);

        scheduler.shutdown(true);
    }
}
