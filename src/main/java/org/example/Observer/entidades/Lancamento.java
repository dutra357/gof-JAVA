package org.example.Observer.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Lancamento {

    private Long codigo;
    private Pessoa pessoa;
    private String descricao;
    private BigDecimal valor;
    private TipoLancamento tipoLancamento;
    private Date dataVencimento;

    public Lancamento() {}
    public Lancamento(Long codigo, Pessoa pessoa,
                      String descricao, BigDecimal valor,
                      TipoLancamento tipoLancamento, Date dataVencimento) {
        this.codigo = codigo;
        this.pessoa = pessoa;
        this.descricao = descricao;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
        this.dataVencimento = dataVencimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public void setTipoLancamento(TipoLancamento tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Lancamento{" +
                "codigo=" + codigo +
                ", pessoa=" + pessoa +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", tipoLancamento=" + tipoLancamento +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}
