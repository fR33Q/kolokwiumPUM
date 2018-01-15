package com.example.damian.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Damian on 15.01.2018.
 */

public class LekiAdapter extends RecyclerView.Adapter<LekiAdapter.ViewHolder> {

    private ArrayList<Leki> listaLekow = new ArrayList<>();

    LekiAdapter(ArrayList<Leki> listaLekow)
    {
        this.listaLekow = listaLekow;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, null);

        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setDawka_leku(listaLekow.get(position).getDawka());
        holder.setNazwa_leku(listaLekow.get(position).getNazwa());
    }

    @Override
    public int getItemCount() {

        return listaLekow.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.lek_nazwa)
        TextView nazwa_leku;

        @BindView(R.id.dawka_lek)
        TextView dawka_leku;

        @BindView(R.id.button_wybierz)
        Button wybierz;

        @OnClick(R.id.button_wybierz)
        void onNameClick() {

            if (wybierz.getText() == "WYBRANO") {
                wybierz.setText("WYBIERZ");

            } else
            {
                wybierz.setText("WYBRANO");

            }
        }

        public ViewHolder(View itemView) {

            super(itemView);
            ButterKnife.bind(this,itemView);


        }

        private void setNazwa_leku(String nazwa) {nazwa_leku.setText(nazwa);}
        private void setDawka_leku(String dawka) {dawka_leku.setText(dawka);}

    }
}
