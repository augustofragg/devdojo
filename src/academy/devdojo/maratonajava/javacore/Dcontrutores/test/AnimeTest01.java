package academy.devdojo.maratonajava.javacore.Dcontrutores.test;

import academy.devdojo.maratonajava.javacore.Dcontrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Haikyuu","TV",12,"Ação");
        anime.imprime();

        Anime animeNovo = new Anime();
        animeNovo.imprime();
    }
}
