package org.example.abstractFactory.aula;

import org.example.abstractFactory.aula.interfaces.GestorDeRisco;
import org.example.abstractFactory.aula.interfaces.Operadora;

import java.math.BigDecimal;

public class Pagamento {

    private Operadora operadora;
    private GestorDeRisco gestorDeRisco;

    public Pagamento(Operadora operadora, GestorDeRisco gestorDeRisco) {
        this.operadora = operadora;
        this.gestorDeRisco = gestorDeRisco;
    }

    public Long autorizar(String cartao, BigDecimal valor) {
        this.operadora.capturar(cartao, valor);
        this.gestorDeRisco.avaliarRisco(cartao, valor);
        return this.operadora.confirmar();
    }
}
