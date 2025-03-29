package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive","TV",12);
        anime.imprime();

        Anime animeNovo = new Anime();
        animeNovo.init("Dragon Ball","TV",200,"ação");
        animeNovo.imprime();

    }
}
