package com.innaval.pagardividas.model;

import androidx.annotation.StringRes;

import com.innaval.pagardividas.R;
import com.innaval.pagardividas.view.MainContrato;

import java.util.ArrayList;
import java.util.List;

public class Pagamento implements MainContrato.MainModel.PagamentosModel {

    private TipoPagamento tipoPagamento;

    @StringRes
    private int valor;

    @StringRes
    private int data;

    public Pagamento() {

    }

    public Pagamento(TipoPagamento tipoPagamento, int valor, int data) {
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
        this.data = data;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public int getValor() {
        return valor;
    }

    public int getData() {
        return data;
    }

    @Override
    public List<Pagamento> getPagamentos() {
        List<Pagamento> pagamento = new ArrayList<>();
        pagamento.add(new Pagamento(TipoPagamento.DINHEIRO, R.string.valor_um_pagamento, R.string.data_um_pagamento));
        pagamento.add(new Pagamento(TipoPagamento.DINHEIRO, R.string.valor_item_dois_tres_pagamento, R.string.data_item_dois_tres_pagamento));
        pagamento.add(new Pagamento(TipoPagamento.CHEQUE, R.string.valor_item_dois_tres_pagamento, R.string.data_item_dois_tres_pagamento));

        return pagamento;
    }

}
