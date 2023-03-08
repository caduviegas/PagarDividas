package com.innaval.pagardividas.model;

import androidx.annotation.StringRes;

import com.innaval.pagardividas.R;
import com.innaval.pagardividas.view.MainContrato;

import java.util.ArrayList;
import java.util.List;

public class Prestacao implements MainContrato.MainModel.PrestacaoModel {

    @StringRes
    private int valor;
    @StringRes
    private int data;
    @StringRes
    private int descricao;

    public Prestacao() {
    }

    public Prestacao(int valor, int data, int descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public int getData() {
        return data;
    }

    public int getDescricao() {
        return descricao;
    }

    @Override
    public List<Prestacao> getPrestacoes() {
        List<Prestacao> prestacoes = new ArrayList<>();
        prestacoes.add(new Prestacao(R.string.escolher_prestacao_item_valor_um, R.string.escolher_prestacao_item_data_um, R.string.escolher_prestacao_item_descricao_um));
        prestacoes.add(new Prestacao(R.string.escolher_prestacao_item_valor_dois, R.string.escolher_prestacao_item_data_dois, R.string.escolher_prestacao_item_descricao_dois));

        return prestacoes;
    }
}