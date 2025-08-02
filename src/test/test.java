package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        List<String> frases = List.of("C# é da Microsoft","Java é da Oracle");
        List<String> frasesb = List.of("I love You ","Computadores são maquinas");

        List<List<String>> frasesAll = new ArrayList<>();
        frasesAll.add(frases);
        frasesAll.add(frasesb);


        List<String> collect = frasesAll.stream()
                .flatMap(Collection::stream)
                .map(String::trim)
                .collect(Collectors.toList());

        for (String string : collect) {
            System.out.println(string);
        }


        String[] nomeSeparado = "Carlos Augusto".split(" ");
        for (String s : nomeSeparado) {
            System.out.println(s);
        }


    }
}
