package org.example.abstractFactory.aula;

import org.example.abstractFactory.aula.factory.interfaces.ModuloPagamentoFactory;
import org.example.abstractFactory.aula.pagamentos.interfaces.GestorDeRisco;
import org.example.abstractFactory.aula.pagamentos.interfaces.Operadora;

import java.math.BigDecimal;

public class Pagamento {

    private Operadora operadora;
    private GestorDeRisco gestorDeRisco;

    public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
        this.operadora = moduloPagamentoFactory.criarOperadora();
        this.gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
    }

    public Long autorizar(String cartao, BigDecimal valor) {
        this.operadora.capturar(cartao, valor);
        this.gestorDeRisco.avaliarRisco(cartao, valor);
        return this.operadora.confirmar();
    }
}
