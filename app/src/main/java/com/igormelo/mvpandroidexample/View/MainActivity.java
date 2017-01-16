package com.igormelo.mvpandroidexample.View;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.igormelo.mvpandroidexample.Model.Model;
import com.igormelo.mvpandroidexample.R;
import com.igormelo.mvpandroidexample.adapter.MeuAdapter;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView.LayoutManager mLayoutManager;

    EditText editName,editAge,editCity;
    RecyclerView recyclerView;
    Model model = new Model();
    MeuAdapter myAdapter;
    FloatingActionButton fb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        myAdapter = new MeuAdapter(new ArrayList<Model>(), this);
        recyclerView.setLayoutManager(mLayoutManager);
        myAdapter.notifyDataSetChanged();
        fb = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        editName = (EditText) findViewById(R.id.editName);
        editAge = (EditText)findViewById(R.id.editAge);
        editCity = (EditText)findViewById(R.id.editCity);


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "salvo com sucesso", Toast.LENGTH_SHORT).show();
                model.setNome(editName.getText().toString());
                model.setCidade(editCity.getText().toString());
                model.setIdade(editAge.getText().toString());
                fb.setEnabled(false);
                myAdapter.getList().add(model);
                Limpar(v);
               recyclerView.setAdapter(myAdapter);
            }
        });

    }
    public void Limpar(View v){
        editName.setText("");
        editAge.setText("");
        editCity.setText("");
    }
    public void goTo(View v){
        Toast.makeText(this, "Go to new activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
