package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {

        // HashSet deixa desordenado
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20,2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));

        for(Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("\n-----------\n");

        Set<Manga> mangasb = new LinkedHashSet<>();
        mangasb.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangasb.add(new Manga(1L, "Berserk", 9.5,5));
        mangasb.add(new Manga(4L, "Pokemon", 3.2,0));
        mangasb.add(new Manga(3L, "Attack on titan", 11.20,2));
        mangasb.add(new Manga(2L, "Dragon ball Z", 2.99,0));
        mangasb.add(new Manga(2L, "Dragon ball Z", 2.99,0));

        for(Manga manga : mangasb) {
            System.out.println(manga);
        }
    }
}
