package com.example.ptsgenap10rpl134;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Dasboardmenu extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboardmenu);


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }


    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();

        m.setTitle("Profile");
        m.setDeskripsi("This is profile description..");
        m.setImg(R.drawable.user);
        models.add(m);

        m.setTitle("cart");
        m.setDeskripsi("This is cart description..");
        m.setImg(R.drawable.cart);
        models.add(m);

        m.setTitle("setting");
        m.setDeskripsi("This is setting description..");
        m.setImg(R.drawable.settings);
        models.add(m);


        return models;

    }
}