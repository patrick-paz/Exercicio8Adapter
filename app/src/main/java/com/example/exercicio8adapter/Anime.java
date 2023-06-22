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
        animes.add(new Anime("Fullmetal Alchemist","9,1/10",R.drawable.Fullmetal));
        animes.add(new Anime("Samurai X","8,5/10",R.drawable.SamuraiX));
        animes.add(new Anime("HunterXHunter","9,0/10",R.drawable.HunterxHunter));
        animes.add(new Anime("Demon Slayer","8,7/10",R.drawable.Kimetsu));
        animes.add(new Anime("Inuyasha","7,9/10",R.drawable.Inuyasha));
        animes.add(new Anime("Durarara!","7,8/10",R.drawable.Durarara));
        animes.add(new Anime("Yu Yu Hakusho","8,5/10",R.drawable.YuYuHakusho));
        animes.add(new Anime("One Piece","8,9/10",R.drawable.OnePiece));
        animes.add(new Anime("Naruto","8,4/10",R.drawable.Naruto));
        animes.add(new Anime("Dragon Ball Kai","8,3/10",R.drawable.DragonBall));

        return animes;

    }
}
