package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {

        String regex = "aba";

        String texto = "abaaba";
        String texto2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto: " + texto2);
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()) {
            System.out.println(matcher.start() + " ");
        }
    }
}
