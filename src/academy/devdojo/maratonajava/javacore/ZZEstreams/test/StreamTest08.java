package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;


//210 - Streams pt 08 - Reduce pt 02
public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {


        //Todos os preços das light novels

        Double reduce = lightNovels.stream()
                .map(LightNovel::getPrice)
                .reduce(0.0, (ln1, ln2) -> ln1 + ln2);

        System.out.printf("%.2f%n",reduce);

        Double reduce1 = lightNovels.stream()
                .map(LightNovel::getPrice)
                .reduce(0.0, Double::sum);

        System.out.printf("%.2f%n",reduce1);


        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        //Stream de primitivos

        double sum1 = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .sum();
        System.out.println(sum1);

        Double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);
    }
}
