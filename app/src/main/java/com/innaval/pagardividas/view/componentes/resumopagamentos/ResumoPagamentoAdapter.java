package com.innaval.pagardividas.view.componentes.resumopagamentos;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.innaval.pagardividas.R;
import com.innaval.pagardividas.databinding.ItemValoresPagamentoBinding;
import com.innaval.pagardividas.model.Constantes;
import com.innaval.pagardividas.model.Valores;

import java.util.List;

public class ResumoPagamentoAdapter extends ListAdapter<Valores, ResumoPagamentoAdapter.ResumoPagamentoViewHolder> {

    private int tamanho;

    public ResumoPagamentoAdapter() {
        super(DIFF_CALLBACK);
    }

    public static final DiffUtil.ItemCallback<Valores> DIFF_CALLBACK = new DiffUtil.ItemCallback<Valores>() {
        @Override
        public boolean areItemsTheSame(@NonNull Valores oldItem, @NonNull Valores newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Valores oldItem, @NonNull Valores newItem) {
            return oldItem == newItem;
        }
    };

    @NonNull
    @Override
    public ResumoPagamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ResumoPagamentoViewHolder(ItemValoresPagamentoBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull ResumoPagamentoViewHolder holder, int position) {
        holder.bind(getItem(position), tamanho);
    }

    @Override
    public void submitList(@Nullable List<Valores> lista) {
        super.submitList(lista);
        if (lista != null && !lista.isEmpty()) {
            tamanho = lista.size();
        }
    }

    public static class ResumoPagamentoViewHolder extends RecyclerView.ViewHolder {

        private final ItemValoresPagamentoBinding binding;

        public ResumoPagamentoViewHolder(ItemValoresPagamentoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Valores valores, int tamanho) {
            binding.valorEsquerdo.setText(valores.getValorEsquerdo());
            binding.valorDireito.setText(valores.getValorDireito());

            if (tamanho == (getAdapterPosition() + Constantes.UM)) {
                binding.endDivider.setVisibility(View.VISIBLE);
                binding.valorDireito.setTextColor(binding.getRoot().getResources().getColor(R.color.red_primary));
            }
        }
    }


}
