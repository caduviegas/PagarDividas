package com.innaval.pagardividas.model;


import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import com.innaval.pagardividas.R;

public enum TipoPagamento {

    DINHEIRO(R.string.dinheiro, R.drawable.ic_money),

    CHEQUE(R.string.cheque, R.drawable.ic_check);

    @StringRes
    private final int valor;

    @DrawableRes
    private final int icone;

    TipoPagamento(@StringRes int valor, @DrawableRes int icone) {
        this.valor = valor;
        this.icone = icone;
    }

    public int getValor() {
        return valor;
    }

    public int getIcone() {
        return icone;
    }
}
