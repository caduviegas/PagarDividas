package com.innaval.pagardividas.view.componentes.comum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.innaval.pagardividas.databinding.CustomViewToolbarBinding;

public class ToolbarCustomView extends ConstraintLayout {

    private CustomViewToolbarBinding binding;


    public ToolbarCustomView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ToolbarCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ToolbarCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public ToolbarCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context){
        binding = CustomViewToolbarBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public void setupVoltar(Runnable callback) {
        binding.voltar.setOnClickListener(view -> callback.run());
    }

    public void setupMais(Runnable callback) {
        binding.mais.setOnClickListener(view -> callback.run());
    }
}
