package com.innaval.pagardividas.view.componentes.resumopagamentos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.innaval.pagardividas.R;
import com.innaval.pagardividas.databinding.CustomViewResumoPrestacaoBinding;
import com.innaval.pagardividas.model.Valores;

import java.util.List;

public class ResumoPagamentosCustomView extends ConstraintLayout {

    private CustomViewResumoPrestacaoBinding binding;
    private ResumoPagamentoAdapter adapter;

    public ResumoPagamentosCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ResumoPagamentosCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ResumoPagamentosCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public ResumoPagamentosCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        binding = CustomViewResumoPrestacaoBinding.inflate(LayoutInflater.from(context), this, true);
        adapter = new ResumoPagamentoAdapter();
        binding.resumoPagamentos.setAdapter(adapter);
    }

    public void submitList(List<Valores> valores) {
        adapter.submitList(valores);
    }

    public void setupNumeroPrestacoes(String numeroPrestacoes) {
        binding.prestacoes.setText(String.format("%s: %s %s", getResources().getText(R.string.resumo_prestacoes_pagamento), numeroPrestacoes, getResources().getText(R.string.resumo_prestacoes_pagamento)));
    }

    public void setupData(String data) {
        binding.data.setText(String.format("%s: %s", getResources().getText(R.string.resumo_data_prestacoes_pagamento), data));
    }
}
