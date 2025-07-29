package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));

//      Exemplo 1 sem method reference
//      animeList.sort((o1,o2) -> o1.getTitle().compareTo(o2.getTitle()));

        //Exemplo 2 ccom method reference

        // Nomes de animes em ordem alfabetica
        //animeList.sort(AnimeComparators::compareByNames);

        // Anime com episodeos em ordem crescente
        animeList.sort(AnimeComparators::compareByEpisodes);

        System.out.println(animeList);

    }
}
