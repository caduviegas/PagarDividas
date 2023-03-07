package com.innaval.pagardividas.view;

import com.innaval.pagardividas.model.Prestacao;

import java.util.List;

public interface MainContrato {

    interface MainView {
        void mostrarGetPrestacoes(List<Prestacao> prestacao);
    }

    interface MainPresenter {
        void getPrestacoes();
    }

    interface MainModel {

        interface PrestacaoModel {
            List<Prestacao> getPrestacoes();
        }
    }
}





