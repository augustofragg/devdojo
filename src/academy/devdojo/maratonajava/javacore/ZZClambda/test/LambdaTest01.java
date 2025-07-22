package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest01 {
    public static void main(String[] args) {

        List<String> strings = List.of("William", "Suane","Luffy","Zoro");
        List<Integer> integers = List.of(1,2,3,4,5);

        //Exemplo com comsumer
        forEach(strings, s -> System.out.println(s));
        forEach(strings,System.out::println);

        forEach(integers, i -> System.out.print(i));
        System.out.println();
        forEach(integers, System.out::print);

        System.out.println("\n---------------------------");

        //Exemplo com predicate
        List<String> stringsFilter = filter(strings,s -> s.length() > 5);
        System.out.println(stringsFilter);

        List<Integer> integersFilter = filter(integers,i -> i % 2 == 0);
        System.out.println(integersFilter);

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterList = new ArrayList<>();
        for (T e : list) {
            if(predicate.test(e)) {
                filterList.add(e);
            }
        }

        return filterList;
    }
}
