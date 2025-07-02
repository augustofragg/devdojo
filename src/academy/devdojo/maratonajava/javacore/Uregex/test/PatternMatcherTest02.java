package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        // \d = retorna Todos os digitos
        // \D = retorna tudo que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = todos os cacaracteres excluindo os brancoSS
        // \w = a-zA-Z, digitos,_
        // \W = Tudo oque não for incluso no W

        String regex = "\\w";

        //String texto = "abaaba";
        String texto2 = "Eu quero 2kg de mussarela\n\t 2kg de presunto";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("Texto: " + texto2);
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
