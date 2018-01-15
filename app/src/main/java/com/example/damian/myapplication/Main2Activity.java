package com.example.damian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
@BindView(R.id.recyclerView)
    RecyclerView recView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setLayoutManager(layoutManager);

        ArrayList<Leki> listaLekow = new ArrayList<>();

        listaLekow.add(new Leki("Aspiryna","100mg"));
        listaLekow.add(new Leki("Ibuprom","150mg"));
        listaLekow.add(new Leki("Apap","450mg"));
        listaLekow.add(new Leki("Mucosolvan","300mg"));
        listaLekow.add(new Leki("Aspot","200mg"));

        LekiAdapter lekiAdapter = new LekiAdapter(listaLekow);
        recView.setAdapter(lekiAdapter);


    }
}
