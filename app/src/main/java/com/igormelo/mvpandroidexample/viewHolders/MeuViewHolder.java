package com.igormelo.mvpandroidexample.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.igormelo.mvpandroidexample.R;

/**
 * Created by root on 10/01/17.
 */

public class MeuViewHolder extends RecyclerView.ViewHolder {
    public TextView name,age,city;
    public MeuViewHolder(View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.name);
        age = (TextView)itemView.findViewById(R.id.age);
        city = (TextView)itemView.findViewById(R.id.city);
    }
}
