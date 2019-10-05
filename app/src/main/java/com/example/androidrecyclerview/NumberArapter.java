package com.example.androidrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberArapter extends RecyclerView.Adapter<NumberArapter.ListNumberViewHolder> {
    public int[] arrNum;

    public NumberArapter(MainActivity mainActivity, int[] arrNum){
        this.arrNum = arrNum;
    }

    @NonNull
    @Override
    public ListNumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_number, parent, false);
        return new ListNumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListNumberViewHolder holder, int position) {
        holder.tvView.setText((position+1)+"");
    }

    @Override
    public int getItemCount() {
        return arrNum.length;
    }

    class ListNumberViewHolder extends RecyclerView.ViewHolder{
        TextView tvView;

        public ListNumberViewHolder( @NonNull View itemView) {
            super(itemView);
            tvView = itemView.findViewById(R.id.text_view);
        }
    }
}

