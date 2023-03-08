package com.innaval.pagardividas.view;

import com.innaval.pagardividas.model.Pagamento;
import com.innaval.pagardividas.model.Prestacao;
import com.innaval.pagardividas.model.ResumoPagamentos;

import java.util.List;

public interface MainContrato {

    interface MainView {

        void mostrarResumoPagamentos(ResumoPagamentos resumoPagamentos);
        void mostrarGetPrestacoes(List<Prestacao> prestacao);

        void mostrarPagamentos(List<Pagamento> pagamentos);
    }

    interface MainPresenter {

        void getResumoPagamentos();
        void getPrestacoes();
        void getPagamentos();

    }

    interface MainModel {

        interface ResumoPagamentosModel{
            ResumoPagamentos getResumoPagamentos();
        }
        interface PrestacaoModel {
            List<Prestacao> getPrestacoes();
        }

        interface PagamentosModel{
            List<Pagamento> getPagamentos();
        }
    }
}





