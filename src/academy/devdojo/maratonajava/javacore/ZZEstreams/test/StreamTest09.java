package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Aula 211 - Streams pt 09 - Gerando streams pt 01
public class StreamTest09 {
    public static void main(String[] args) {

        IntStream.rangeClosed(0, 50).filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream.range(0, 50).filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
        System.out.println();

        Stream.of("Eleven"," O", " Cosmo ", " no Seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int[] num = {1,2,3,4,5,6};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(line -> line.contains("Java"))
                    .forEach(System.out::println);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
