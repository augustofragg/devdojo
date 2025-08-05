package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.PROMOTION;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.PROMOTION.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.PROMOTION.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;


//218 - Streams pt 16 - Parallel Streams pt 01

public class StreamTest16 {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 100_000_000;

        sumFor(num);

        sumStreamIterate(num);

        sumParallelStreamIterate(num);

        sumLongStreamIterate(num);

        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(Long num) {
        System.out.println("sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 1; i <= num; i++) {
            result += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(Long num) {
        System.out.println("sum  StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, n -> n + 1)
                .limit(num)
                .reduce(0L,Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(Long num) {
        System.out.println("sum StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, n -> n + 1)
                .limit(num)
                .parallel()
                .reduce(0L,Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(Long num) {
        System.out.println("sum Long StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.range(1L,num)
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(Long num) {
        System.out.println("sum parallel Long StreamIterate");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.range(1L,num)
                .parallel()
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

}
