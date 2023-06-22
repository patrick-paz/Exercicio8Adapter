package com.example.exercicio8adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimeAdapter extends BaseAdapter {

    private final Context context;
    private final List<Anime> animes;

    public AnimeAdapter(Context context, List<Anime> animes) {
        this.context = context;
        this.animes = animes;
    }

    @Override
    public int getCount() {

        return animes.size();
    }

    @Override
    public Object getItem(int i) {

        return animes.get(i);
    }

    @Override
    public long getItemId(int i) {

        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.adapter_anime, viewGroup,false);
        TextView titulo = (TextView) v.findViewById(R.id.txtTitulo);
        TextView nota = (TextView) v.findViewById(R.id.txtImdb);
        ImageView img = (ImageView) v.findViewById(R.id.imgAnime);

        Anime anime = animes.get(i);
        titulo.setText(anime.nome);
        nota.setText(anime.nota);
        img.setImageResource(anime.img);

        return v;
    }
}
