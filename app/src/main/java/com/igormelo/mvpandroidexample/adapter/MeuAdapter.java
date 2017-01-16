package com.igormelo.mvpandroidexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.igormelo.mvpandroidexample.Model.Model;
import com.igormelo.mvpandroidexample.R;
import com.igormelo.mvpandroidexample.viewHolders.MeuViewHolder;

import java.util.ArrayList;

/**
 * Created by root on 09/01/17.
 */
public class MeuAdapter extends RecyclerView.Adapter<MeuViewHolder> {
    private ArrayList<Model> modelo;
    private Context context;

    public MeuAdapter(ArrayList<Model> modelo, Context context) {
        this.modelo = modelo;
        this.context = context;
    }


    @Override
    public MeuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cada_item_lista, parent, false);
        return new MeuViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MeuViewHolder holder, int position) {
        Model item = modelo.get(position);
        holder.name.setText(item.getNome());
        holder.age.setText(item.getIdade());
        holder.city.setText(item.getCidade());

    }

    public ArrayList<Model> getList() {
        return modelo;
    }

    @Override
    public int getItemCount() {
        return modelo.size();
    }

}
