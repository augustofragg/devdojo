package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.PROMOTION;

import java.util.*;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.PROMOTION.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.PROMOTION.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;


//217 - Streams pt 15 - Collectors pt 05 - Grouping by pt 04
public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // Map<Category, List<Promotion>
        Map<Category, List<PROMOTION>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory
                        , mapping(StreamTest15::getPromotion, toList())));
        System.out.println(collect1);

        Map<Category, Set<PROMOTION>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect2);


        Map<Category, LinkedHashSet<PROMOTION>> collect3 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect3);

    }

    private static PROMOTION getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
