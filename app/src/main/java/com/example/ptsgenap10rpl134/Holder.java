package com.example.ptsgenap10rpl134;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    ImageView mImaeview;
    TextView mTitle, mDes;

    public Holder(@NonNull View itemView) {
        super(itemView);

        this.mImaeview = itemView.findViewById(R.id.imageView);
        this.mTitle = itemView.findViewById(R.id.txt_title);
        this.mDes = itemView.findViewById(R.id.txt_deskripsi);
    }
}
