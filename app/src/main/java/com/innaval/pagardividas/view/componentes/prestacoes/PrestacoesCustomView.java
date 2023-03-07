package com.innaval.pagardividas.view.componentes.prestacoes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.innaval.pagardividas.databinding.CustomViewEscolherPrestacaoBinding;
import com.innaval.pagardividas.model.Prestacao;

import java.util.List;

public class PrestacoesCustomView extends ConstraintLayout {

    private CustomViewEscolherPrestacaoBinding binding;
    private  PrestacoesAdapter adapter;


    public PrestacoesCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public PrestacoesCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PrestacoesCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public PrestacoesCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context){
        binding = CustomViewEscolherPrestacaoBinding.inflate(LayoutInflater.from(context), this, true);
        adapter = new PrestacoesAdapter();
        binding.prestacoes.setAdapter(adapter);
    }

    public void submitList(List<Prestacao> prestacoes){
        adapter.submitList(prestacoes);
    }

}

