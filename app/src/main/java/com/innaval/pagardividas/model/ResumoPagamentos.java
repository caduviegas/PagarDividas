package com.innaval.pagardividas.model;

import com.innaval.pagardividas.view.MainContrato;

import java.util.List;

public class ResumoPagamentos implements MainContrato.MainModel.ResumoPagamentosModel {

    private Integer numeroPrestacoes;
    private String dataPagamento;
    private List<Valores> valores;

    public ResumoPagamentos() {

    }

    public ResumoPagamentos(Integer numeroPrestacoes, String dataPagamento, List<Valores> valores) {
        this.numeroPrestacoes = numeroPrestacoes;
        this.dataPagamento = dataPagamento;
        this.valores = valores;
    }

    public Integer getNumeroPrestacoes() {
        return numeroPrestacoes;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public List<Valores> getValores() {
        return valores;
    }

    @Override
    public ResumoPagamentos getResumoPagamentos() {
        return new ResumoPagamentos(2, "10/18/2018", new Valores().getListaValoresPagamento());
    }
}
