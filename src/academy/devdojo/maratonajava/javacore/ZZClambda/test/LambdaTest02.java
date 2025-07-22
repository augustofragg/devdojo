package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> namesList = List.of("Augusto","Luna","Jully");

        List<Integer> sizeNames = map(namesList, String::length);
        System.out.println(sizeNames);

    }

    private static <T,R> List<R> map(List<T> list, Function<T,R> function) {
        List<R> newList = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            newList.add(r);
        }
        return newList;
    }
}
