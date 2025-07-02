package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        // \d = retorna Todos os digitos
        // \D = retorna tudo que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = todos os cacaracteres excluindo os brancoSS
        // \w = a-zA-Z, digitos,_
        // \W = Tudo oque não for incluso no W
        // []


//      String regex = "[a-zA-C]";
//      String regex = "[0x,A-F,0-9]";
        String regex = "0[xX][0-9a-fA-F]";

        //String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";

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
