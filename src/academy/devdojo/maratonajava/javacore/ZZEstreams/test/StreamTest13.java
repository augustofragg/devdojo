package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.PROMOTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Aula 215 - Streams pt 13 - Collectors pt 03 - Grouping by pt 02
public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99,Category.FANTASY),
            new LightNovel("Violet Evergarden", 10.99,Category.DRAMA),
            new LightNovel("No Game no life", 2.99,Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99,Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99,Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99,Category.FANTASY),
            new LightNovel("Monogatari", 4.00,Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<PROMOTION, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln ->ln.getPrice() > 6 ? PROMOTION.NORMAL_PRICE : PROMOTION.UNDER_PROMOTION));
        System.out.println(collect);

        //Map<PROMOTION, Map<Category,List<LightNovel>>


        Map<Category, Map<PROMOTION, List<LightNovel>>> collect1 = lightNovels.stream().collect(
                Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(ln -> ln.getPrice() > 6 ? PROMOTION.NORMAL_PRICE : PROMOTION.UNDER_PROMOTION
                        )));

        System.out.println(collect1);
    }
}
