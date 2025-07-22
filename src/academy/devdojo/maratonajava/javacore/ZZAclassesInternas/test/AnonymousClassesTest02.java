package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;


import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoListComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        //Exemplo1
        //barcoList.sort(new BarcoListComparator());

        //Exemplo 2
        barcoList.sort(new Comparator<Barco>(){
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            };
        });


        System.out.println(barcoList);
        //Exemplo 3
        //barcoList.sort((o1,o2) -> o1.getNome().compareTo(o2.getNome()));
    }
}
