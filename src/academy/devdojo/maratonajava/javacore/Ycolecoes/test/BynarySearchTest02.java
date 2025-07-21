package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BynarySearchTest02 {
    public static void main(String[] args) {
        MangaSortById mangaSortById = new MangaSortById();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99));

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L,"Dragon Ball z", 2.99);
        System.out.println(Collections.binarySearch(mangas,mangaToSearch,mangaSortById));
    }
}
