package org.example.Observer.repositorios;

import org.example.Observer.entidades.Lancamento;
import org.example.Observer.entidades.Pessoa;
import org.example.Observer.entidades.TipoLancamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Lancamentos {

    public List<Lancamento> todosVencidos() {
        Lancamento lancamento01 = new Lancamento(1l,
                new Pessoa(1L, "Joao Silva", "joao@gmail.com", "(48)1234-5678"),
                "Mesa tabaco MDF", new BigDecimal("1225.45"),
                TipoLancamento.DESPESA, new Date()
        );

        Lancamento lancamento02 = new Lancamento(1l,
                new Pessoa(1L, "Renato dos Santos Silva", "renato@gmail.com", "(48)9999-5678"),
                "Armario BR MDF", new BigDecimal("345.15"),
                TipoLancamento.DESPESA, new Date()
        );

        return new ArrayList<>(List.of(lancamento01, lancamento02));
    }
}
