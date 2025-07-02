package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {

        // \d = retorna Todos os digitos
        // \D = retorna tudo que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = todos os cacaracteres excluindo os brancoSS
        // \w = a-zA-Z, digitos,_
        // \W = Tudo oque não for incluso no W
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | -> or Ex.: o(v|c)o -> ovo ou oco
        // $ representa o fim da linha
        // .

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
