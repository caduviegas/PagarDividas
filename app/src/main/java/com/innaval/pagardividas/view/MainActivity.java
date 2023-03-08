package com.innaval.pagardividas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.innaval.pagardividas.R;
import com.innaval.pagardividas.databinding.ActivityMainBinding;
import com.innaval.pagardividas.model.Pagamento;
import com.innaval.pagardividas.model.Prestacao;
import com.innaval.pagardividas.model.ResumoPagamentos;
import com.innaval.pagardividas.presenter.MainPresenter;
import com.innaval.pagardividas.view.MainContrato;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContrato.MainView {

    private ActivityMainBinding binding;

    private MainContrato.MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupPresenter();
        getResumoPagamento();
        getPrestacoes();
        getPagamentos();
    }

    private void setupPresenter() {
        presenter = new MainPresenter(this);
    }

    private void getResumoPagamento() {
        presenter.getResumoPagamentos();
    }

    private void getPrestacoes() {
        presenter.getPrestacoes();
    }

    private void getPagamentos() {
        presenter.getPagamentos();
    }

    @Override
    public void mostrarGetPrestacoes(List<Prestacao> prestacoes) {
        binding.prestacoes.submitList(prestacoes);
    }

    @Override
    public void mostrarResumoPagamentos(ResumoPagamentos resumoPagamentos) {
        binding.resumoPagamentos.setupNumeroPrestacoes(resumoPagamentos.getNumeroPrestacoes().toString());
        binding.resumoPagamentos.setupData(resumoPagamentos.getDataPagamento());
        binding.resumoPagamentos.submitList(resumoPagamentos.getValores());
    }

    @Override
    public void mostrarPagamentos(List<Pagamento> pagamentos) {
        binding.pagamentos.submitList(pagamentos);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}