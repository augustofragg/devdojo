package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Aula 207 - Streams pt 05 - FlatMap pt 02
public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        //Ex.:1
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        //Ex.:2
        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        for (String[] strings : collect) {
            for (String string : strings) {
                System.out.print(string);
            }
        }

        Stream<String> stream = Arrays.stream(letters);
        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println(letters2);
    }
}
