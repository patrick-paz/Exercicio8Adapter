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

    public static List<Anime> getAnimes(){
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Fullmetal Alchemist","9,1/10",R.drawable.fullmetal));
        animes.add(new Anime("Samurai X","8,5/10",R.drawable.samuraix));
        animes.add(new Anime("HunterXHunter","9,0/10",R.drawable.hunterxhunter));
        animes.add(new Anime("Demon Slayer","8,7/10",R.drawable.kimetsu));
        animes.add(new Anime("Inuyasha","7,9/10",R.drawable.inuyasha));
        animes.add(new Anime("Durarara!","7,8/10",R.drawable.durarara));
        animes.add(new Anime("Yu Yu Hakusho","8,5/10",R.drawable.yuyuhakusho));
        animes.add(new Anime("One Piece","8,9/10",R.drawable.onepiece));
        animes.add(new Anime("Naruto","8,4/10",R.drawable.naruto));
        animes.add(new Anime("Dragon Ball Kai","8,3/10",R.drawable.dragonball));

        return animes;

    }
}
