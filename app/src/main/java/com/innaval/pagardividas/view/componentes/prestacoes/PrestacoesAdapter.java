package com.innaval.pagardividas.view.componentes.prestacoes;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.innaval.pagardividas.databinding.ItemEscolherPrestacaoBinding;
import com.innaval.pagardividas.model.Prestacao;

public class PrestacoesAdapter extends ListAdapter<Prestacao, PrestacoesAdapter.PrestacaoViewHolder> {

    public PrestacoesAdapter() {
        super(DIFF_CALLBACK);
    }

    public static final DiffUtil.ItemCallback<Prestacao> DIFF_CALLBACK = new DiffUtil.ItemCallback<Prestacao>() {
        @Override
        public boolean areItemsTheSame(@NonNull Prestacao oldItem, @NonNull Prestacao newItem) {
            return false;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Prestacao oldItem, @NonNull Prestacao newItem) {
            return oldItem == newItem;
        }
    };

    @NonNull
    @Override
    public PrestacaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PrestacaoViewHolder(ItemEscolherPrestacaoBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull PrestacaoViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public static class PrestacaoViewHolder extends RecyclerView.ViewHolder {

        private final ItemEscolherPrestacaoBinding binding;

        public PrestacaoViewHolder(ItemEscolherPrestacaoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Prestacao prestacao) {
            binding.value.setText(prestacao.getValue());
            binding.date.setText(prestacao.getDate());
            binding.description.setText(prestacao.getDescription());
        }
    }
}
