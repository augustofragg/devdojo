package academy.devdojo.maratonajava.javacore.ZZClambda.service;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;

public class AnimeComparators {

    public static int compareByNames(Anime o1, Anime o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    public static int compareByEpisodes(Anime o1, Anime o2) {
        return Integer.compare(o1.getEpisodes(), o2.getEpisodes());
    }
}
