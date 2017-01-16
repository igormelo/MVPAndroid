package com.igormelo.mvpandroidexample.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.igormelo.mvpandroidexample.Model.PaisModel;
import com.igormelo.mvpandroidexample.R;
import com.igormelo.mvpandroidexample.adapter.PaisAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
RecyclerView recyclerView2;
    private PaisAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PaisAdapter(this,getList());
        recyclerView2.setAdapter(adapter);
    }
    private List<PaisModel> getList(){
        List<PaisModel> lista = new ArrayList<>();
        PaisModel p = new PaisModel();
        p.setNome("Suecia");
        p.setContinente("Europa");
        p.setUrlDaImagem("https://upload.wikimedia.org/wikipedia/en/thumb/4/4c/Flag_of_Sweden.svg/1280px-Flag_of_Sweden.svg.png");
        lista.add(p);

        p = new PaisModel();
        p.setNome("Inglaterra");
        p.setContinente("Europa");
        p.setUrlDaImagem("http://famouswonders.com/wp-content/uploads/2009/11/England-flag.jpg");

        p = new PaisModel();
        p.setNome("Escócia");
        p.setContinente("Europa");
        p.setUrlDaImagem("https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Flag_of_Scotland.svg/800px-Flag_of_Scotland.svg.png");

        lista.add(p);

        p = new PaisModel();
        p.setNome("País de Gales");
        p.setContinente("Europa");
        p.setUrlDaImagem("http://1.bp.blogspot.com/-s974oryDuQI/TaCw6DD2_KI/AAAAAAAAACs/fnK8by8GBBc/s1600/Wales_Flag.jpg");

        lista.add(p);

        p = new PaisModel();
        p.setNome("Irlanda");
        p.setContinente("Europa");
        p.setUrlDaImagem("https://upload.wikimedia.org/wikipedia/commons/1/13/Ireland_flag_300.png");

        lista.add(p);
        return lista;
    }
}
