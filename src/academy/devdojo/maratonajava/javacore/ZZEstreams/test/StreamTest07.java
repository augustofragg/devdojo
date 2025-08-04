package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

//209 - Streams pt 07 - Reduce pt 01
public class StreamTest07 {
    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        //Ex.1
        integers.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);

        //Ex.2
        Integer reduce = integers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

        //Ex.3
        Integer reduce1 = integers.stream().reduce(0,Integer::sum);
        System.out.println(reduce1);

        //Ex.4
        Integer reduce2 = integers.stream().reduce(1, (x, y) -> x * y);
        System.out.println(reduce2);

        //Ex.5
        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);

        //Ex.6
        Integer maxOrmin = integers.stream().reduce(0,Integer::max);
        System.out.println(maxOrmin);


    }
}
