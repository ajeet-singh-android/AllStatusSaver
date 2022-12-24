package com.skyway.allsatatussaver.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.skyway.allsatatussaver.Models.MainModel;
import com.skyway.allsatatussaver.R;
import com.skyway.allsatatussaver.databinding.MainItemBinding;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.exViewHolder> {

    Context context;
    List<MainModel> list = new ArrayList<>();
    ItemClickLisner listner;

    public MainAdapter(Context context, List<MainModel> list, ItemClickLisner listner) {
        this.context = context;
        this.list = list;
        this.listner = listner;
    }

    @NonNull
    @Override
    public MainAdapter.exViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new exViewHolder(LayoutInflater.from(context).inflate(R.layout.main_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.exViewHolder holder, int position) {
        MainModel model = list.get(position);
        holder.binding.itemLogo.setImageResource(model.getImage());
        holder.binding.textView.setText(model.getName());
        holder.itemView.setOnClickListener(view -> {
            listner.clickd(position);
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface ItemClickLisner {

        void clickd(int pos);
    }

    public class exViewHolder extends RecyclerView.ViewHolder {
        MainItemBinding binding;

        public exViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = MainItemBinding.bind(itemView);

        }
    }

}
