package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        //Lista sem generics
        List list = new ArrayList();
        list.add("Carro");
        list.add(2);
        list.add(new Consumidor("Augusto"));

        //Sem generics a Lista Aceita Qualquer Tipo e a iteração tem
        //Que ser abrangente
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("----------------");

        //Lista com generics
        List<String> listString = new ArrayList<>();
        listString.add("Carlos Augusto");
        listString.add("Programador");
        listString.add("Java");

        for (String s : listString) {
            System.out.println(s);
        }
        System.out.println("--------------------");

        //Type Erasure
        //Na compilação, o Java remove os tipos genéricos e transforma tudo em Object
        // (para manter compatibilidade com versões antigas do Java).

        //Exemplo 2 A iteração lançara um erro do tipo ClassCasException
        add(listString,new Consumidor("Teste"));
        for (String s : listString) {
            System.out.println(s);
        }


    }

    private static void add(List list,Consumidor consumidor) {
       list.add(consumidor);
    }
}
