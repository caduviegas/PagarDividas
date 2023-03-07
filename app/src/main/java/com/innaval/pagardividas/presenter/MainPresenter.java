package com.innaval.pagardividas.presenter;

import com.innaval.pagardividas.model.Pagamento;
import com.innaval.pagardividas.model.Prestacao;
import com.innaval.pagardividas.model.ResumoPagamentos;
import com.innaval.pagardividas.view.MainContrato;

public class MainPresenter implements MainContrato.MainPresenter {

    private final MainContrato.MainView view;

    private final MainContrato.MainModel.PrestacaoModel prestacaoModel = new Prestacao();

    private final MainContrato.MainModel.PagamentosModel pagamentosModel = new Pagamento();

    private final MainContrato.MainModel.ResumoPagamentosModel resumoPagamentosModel = new ResumoPagamentos();

    public MainPresenter(MainContrato.MainView view) {
        this.view = view;
    }

    @Override
    public void getPrestacoes() {
        view.mostrarGetPrestacoes(prestacaoModel.getPrestacoes());
    }

    @Override
    public void getResumoPagamentos() {
        view.mostrarResumoPagamentos(resumoPagamentosModel.getResumoPagamentos());
    }

    @Override
    public void getPagamentos() {
        view.mostrarPagamentos(pagamentosModel.getPagamentos());
    }
}
