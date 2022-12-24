package com.skyway.allsatatussaver.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.skyway.allsatatussaver.R;
import com.skyway.allsatatussaver.databinding.StatusItemBinding;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.exViewHolder> {
    @NonNull
    @Override
    public StatusAdapter.exViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new exViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.status_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapter.exViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class exViewHolder extends RecyclerView.ViewHolder {
        StatusItemBinding binding;

        public exViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = StatusItemBinding.bind(itemView);
        }
    }
}
