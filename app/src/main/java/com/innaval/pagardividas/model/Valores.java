package com.innaval.pagardividas.model;

import java.util.ArrayList;
import java.util.List;

public class Valores {

    private String valorEsquerdo;
    private String valorDireito;

    public Valores(){

    }

    public Valores(String valorEsquerdo, String valorDireito){
        this.valorEsquerdo = valorEsquerdo;
        this.valorDireito = valorDireito;
    }

    public String getValorEsquerdo(){
        return  valorEsquerdo;
    }

    public String getValorDireito(){
        return valorDireito;
    }

    public List<Valores> getListaValoresPagamento(){
        List<Valores> valores = new ArrayList<>();
        valores.add(new Valores("Total:", "R$ 1.501,26"));
        valores.add(new Valores("Crédito (R$)", "R$ 59.25"));
        valores.add(new Valores("Taxa (%)", "3.00"));
        valores.add(new Valores("Pago", "1.021,98"));
        valores.add(new Valores("Valor Restando", "R$ 479,28"));

        return valores;
    }
}
