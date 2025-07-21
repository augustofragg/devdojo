package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaSortById implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L,"Berserker",19.9));
        mangas.add(new Manga(1L,"Hellsing Ultimate",9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"Attack on titan",11.2));
        mangas.add(new Manga(2L,"Dragon ball z",2.99));

        // Ordenando Lista de Objetos customizados

        for(Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------");

        Collections.sort(mangas);

        for(Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------");

        //Ordenando com a interface Comparator
        // Exemplo 1
        // Collections.sort(mangas,new MangaSortById());

        // Exemplo 2
        mangas.sort(new MangaSortById());
        for(Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------");


    }
}
