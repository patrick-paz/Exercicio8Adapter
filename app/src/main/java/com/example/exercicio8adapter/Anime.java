package com.example.exercicio8adapter;

import java.util.ArrayList;
import java.util.List;

public class Anime {

    public String nome;
    public String nota;
    public int img;

    public Anime(String nome, String nota, int img){
        this.nome = nome;
        this.nota = nota;
        this.img = img;
    }

    public static List<Anime> getAnime(){
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Fullmetal Alchemist","9,1/10",R.drawable.Fullmetal));



        return animes;

    }
}
