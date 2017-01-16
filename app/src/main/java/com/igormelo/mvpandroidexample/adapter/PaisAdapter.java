package com.igormelo.mvpandroidexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.igormelo.mvpandroidexample.Model.PaisModel;
import com.igormelo.mvpandroidexample.R;
import com.igormelo.mvpandroidexample.viewHolders.PaisViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by root on 12/01/17.
 */

public class PaisAdapter extends RecyclerView.Adapter<PaisViewHolder> {
    private List<PaisModel> lista;
    private Context context;
    public PaisAdapter(Context context, List<PaisModel> lista){
        this.context = context;
        this.lista = lista;
    }

    @Override
    public PaisViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pais, parent, false);
        return new PaisViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(PaisViewHolder holder, int position) {
        PaisModel item = lista.get(position);
        holder.nome.setText(item.getNome());
        holder.continente.setText(item.getContinente());
        Picasso.with(context).load(item.getUrlDaImagem()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
    public PaisModel getItem(int position){
        return lista.get(position);
    }
}
