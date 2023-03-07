package com.innaval.pagardividas.view;

import com.innaval.pagardividas.model.Pagamento;
import com.innaval.pagardividas.model.Prestacao;
import com.innaval.pagardividas.model.ResumoPagamentos;

import java.util.List;

public interface MainContrato {

    interface MainView {
        void mostrarGetPrestacoes(List<Prestacao> prestacao);

        void mostrarResumoPagamentos(ResumoPagamentos resumoPagamentos);

        void mostrarPagamentos(List<Pagamento> pagamentos);
    }

    interface MainPresenter {
        void getPrestacoes();
        void getResumoPagamentos();
        void getPagamentos();

    }

    interface MainModel {

        interface PrestacaoModel {
            List<Prestacao> getPrestacoes();
        }

        interface ResumoPagamentosModel{
            ResumoPagamentos getResumoPagamentos();
        }

        interface PagamentosModel{
            List<Pagamento> getPagamentos();
        }
    }
}





