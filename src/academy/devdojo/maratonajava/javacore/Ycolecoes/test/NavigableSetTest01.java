package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getModelo().compareTo(o2.getModelo());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        //Declaração do NavigableSet com a impletação treet

        //Exemplo 1
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);
        System.out.println("--------------");

        //Exemplo 2
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20,2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
        System.out.println("------------------");
        //Exemplo 3
        NavigableSet<Manga> mangasb = new TreeSet<>(new MangaPriceComparator());
        mangasb.add(new Manga(5L, "Hellsing Ultimate", 19.9,0));
        mangasb.add(new Manga(1L, "Berserk", 9.5,5));
        mangasb.add(new Manga(4L, "Pokemon", 3.2,0));
        mangasb.add(new Manga(3L, "Attack on titan", 11.20,2));
        mangasb.add(new Manga(2L, "Dragon ball Z", 2.99,0));
        mangasb.add(new Manga(2L, "Dragon ball Z", 2.99,0));

        System.out.println("Lista de Manga ordenada pelo preco");

        for (Manga manga : mangasb) {
            System.out.println(manga);
        }
        System.out.println("----------------------");

        //Exemplo 4
        //Metodos de comparacao
        //lower < menor que
        //floor < menor igual
        //heigher > maior que

        Manga yuyu = new Manga(1L, "yuyu", 3.2, 5);
        System.out.println(mangasb.lower(yuyu));
        System.out.println(mangasb.floor(yuyu));
        System.out.println(mangasb.higher(yuyu));
        System.out.println(mangasb.ceiling(yuyu));
        System.out.println("------------------");

        //Exemplo 5
        System.out.println(mangasb.size());
        System.out.println(mangasb.pollLast());
        System.out.println(mangasb.size());
    }
}
