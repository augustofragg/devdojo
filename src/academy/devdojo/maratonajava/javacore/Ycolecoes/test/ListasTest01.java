package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasTest01 {
    public static void main(String[] args) {

//
//        1.4
//        List nomes = new ArrayList();
//        nomes.add("Augusto");
//        nomes.add("Luna");
//        nomes.add("Jully");
//        nomes.add(123);

//
//      Declarando a lista   1.5
        List<String> nomes = new ArrayList<>(16);

//        Adição de Elementos
        nomes.add("Augusto");
        nomes.add("Jully");
        nomes.add("Luna");

//         Iterando sobre os elementos
        for(String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("--------------");

        nomes.add("Tiago");

        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        //Imprimindo a list no sout
        System.out.println(nomes);
        System.out.println("---------------");

        //Não é recomendado Adicionar elemento dentro do loop
        //de iteração

        // Exemplo 3
        // Listas não podem ser com tipos primitivos
        // Utiliza-se wraper class. Integer, String, Double..

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for (int num : numeros) {
            System.out.println(num);
        }

        //Exemplo 4
        // Remoçao de elementos
        List<String> frutas = new ArrayList<>();
        frutas.add("Abacaxi");
        frutas.add("Laranja");
        frutas.add("Uva");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("---------------");

//        Pelo indice
//        frutas.remove(1);

//        Pelo objeto
        boolean isRemove = frutas.remove("Uva");
        System.out.println(isRemove);

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("---------------");

//        Exemplo 5
//        Unindo listas
        List<String> toyota = new ArrayList<>();
        toyota.add("Supra");
        toyota.add("Corola");

        List<String> chevrolet = new ArrayList<>();
        chevrolet.add("Camaro");
        chevrolet.add("Onix");

        List<String> carros = new ArrayList<>();
        carros.addAll(toyota);
        carros.addAll(chevrolet);

        for(String carro : carros) {
            System.out.println(carro);
        }
    }
}
