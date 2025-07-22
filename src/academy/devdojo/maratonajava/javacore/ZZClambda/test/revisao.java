package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class revisao {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Carlos Augusto","Luna","July"));

        consumeList(names,new Consumer<>() {
            @Override
            public void accept(List<String> nomes) {
                System.out.println(nomes);
            }
        });

        consumeList(names,(name) -> System.out.println(name));
        consumeList(names,System.out::println);
        Consumer<List<String>> print = System.out::println;
        consumeList(names,print);

        System.out.println("-----------------");

        int result = functionList(20, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        });

        System.out.println(result);

        int numA = 30;
        result = functionList(numA,(num) -> num * 30);
        System.out.println(result);

        Function<Integer,Integer> dobrar = (num) -> num * 2;
        result = functionList(30,dobrar);
        System.out.println(result);

        System.out.println("--------------------");

        List<String> newNames = filterList(names,new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.charAt(0) == 'C';
            }
        });
        System.out.println(newNames);

        newNames = filterList(names,(name) -> name.charAt(0) == 'L');
        System.out.println(newNames);

        Predicate<String> filterChar = (name) -> name.charAt(0) == 'J';
        newNames = filterList(names,filterChar);
        System.out.println(newNames);

    }

    private static <T>  void consumeList(List<T> list, Consumer<List<T>> consumer) {
        consumer.accept(list);
    }

    private static <T> T functionList(T object, Function<T,T> function) {
        return function.apply(object);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filterList = new ArrayList<>();

        for (T t : list) {

            if(predicate.test(t)) {
                filterList.add(t);
            }
        }

        return filterList;
    }
}
