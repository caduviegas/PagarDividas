package com.innaval.pagardividas.view.componentes.pagamentos;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.innaval.pagardividas.databinding.ItemPagamentoBinding;
import com.innaval.pagardividas.model.Pagamento;

public class PagamentosAdapter extends ListAdapter<Pagamento, PagamentosAdapter.PagamentoViewHolder> {

    public PagamentosAdapter() {
        super(DIFF_CALLBACK);
    }

    public static final DiffUtil.ItemCallback<Pagamento> DIFF_CALLBACK = new DiffUtil.ItemCallback<Pagamento>() {

        @Override
        public boolean areItemsTheSame(@NonNull Pagamento oldItem, @NonNull Pagamento newItem) {
            return oldItem == newItem;
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Pagamento oldItem, @NonNull Pagamento newItem) {
            return oldItem == newItem;
        }

    };

    @NonNull
    @Override
    public PagamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PagamentoViewHolder(
                ItemPagamentoBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PagamentoViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public static class PagamentoViewHolder extends RecyclerView.ViewHolder {

        private final ItemPagamentoBinding binding;

        public PagamentoViewHolder(ItemPagamentoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Pagamento pagamento) {
            binding.pagamento.setText(pagamento.getTipoPagamento().getValor());
            binding.valor.setText(pagamento.getValor());
            binding.data.setText(pagamento.getData());
            binding.icone.setImageDrawable(ResourcesCompat.getDrawable(binding.getRoot().getResources(), pagamento.getTipoPagamento().getIcone(), null));
        }
    }
}
