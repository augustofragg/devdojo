package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        // List -> Array
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] integersArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integersArray));
        System.out.println("----------------");

        //Array -> List
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        //Exemplo 1
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);

        // Gera erro
        // arrayToList.add(13);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        System.out.println("--------------------");

        //Exemplo 2
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        //Exemplo 3
        List<String> strings = Arrays.asList("1","2");
        System.out.println(Arrays.toString(strings.toArray()));

    }
}
