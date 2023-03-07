package com.innaval.pagardividas.view.componentes.pagamentos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.innaval.pagardividas.databinding.CustomViewPagamentosBinding;
import com.innaval.pagardividas.model.Pagamento;

import java.util.List;

public class PagamentosCustomView extends ConstraintLayout {

    private CustomViewPagamentosBinding binding;
    private PagamentosAdapter adapter;

    public PagamentosCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public PagamentosCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PagamentosCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public PagamentosCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        binding = CustomViewPagamentosBinding.inflate(LayoutInflater.from(context), this, true);
        adapter = new PagamentosAdapter();
        binding.pagamento.setAdapter(adapter);
    }

    public void submitList(List<Pagamento> pagamentos) {
        adapter.submitList(pagamentos);
    }
}
