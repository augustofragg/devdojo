package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail.com";

        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));

        System.out.println(texto.split(",")[1].trim());
        System.out.println(Arrays.toString(texto.split(",")));

        System.out.println("---------\n");

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
