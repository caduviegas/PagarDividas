package com.innaval.pagardividas.model;

import androidx.annotation.StringRes;

import com.innaval.pagardividas.R;
import com.innaval.pagardividas.view.MainContrato;

import java.util.ArrayList;
import java.util.List;

public class Prestacao implements MainContrato.MainModel.PrestacaoModel {

    @StringRes
    private int value;

    @StringRes
    private int date;

    @StringRes
    private int description;

    public Prestacao(){

    }

    public Prestacao(int value, int date, int description){
        this.value = value;
        this.date = date;
        this.description = description;
    }

    public int getValue(){
        return value;
    }

    public int getDate(){
        return date;
    }

    public int getDescription(){
        return description;
    }

    @Override
    public List<Prestacao> getPrestacoes() {
        List<Prestacao> prestacao = new ArrayList<>();
        prestacao.add(new Prestacao(R.string.escolher_prestacao_item_valor_um, R.string.escolher_prestacao_item_data_um, R.string.escolher_prestacao_item_descricao_um));
        prestacao.add(new Prestacao(R.string.escolher_prestacao_item_valor_dois, R.string.escolher_prestacao_item_data_dois,R.string.escolher_prestacao_item_descricao_dois));

        return prestacao;
    }
}
