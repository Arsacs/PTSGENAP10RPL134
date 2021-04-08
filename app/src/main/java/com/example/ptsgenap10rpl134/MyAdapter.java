package com.example.ptsgenap10rpl134;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<Holder> {

    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemview, null);
        return new Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

        holder.mTitle.setText(models.get(i).getTitle("Profile"));
        holder.mDes.setText(models.get(i).getDeskripsi("User Profile"));
        holder.mImaeview.setImageResource(models.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
