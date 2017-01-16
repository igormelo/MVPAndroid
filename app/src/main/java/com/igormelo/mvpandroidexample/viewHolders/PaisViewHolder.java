package com.igormelo.mvpandroidexample.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.igormelo.mvpandroidexample.R;

/**
 * Created by root on 12/01/17.
 */
public class PaisViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView nome;
    public TextView continente;
    public PaisViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.bandeira);
        nome = (TextView) itemView.findViewById(R.id.nome);
        continente = (TextView) itemView.findViewById(R.id.continente);
    }
}
