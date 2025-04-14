package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        System.out.println(nome.charAt(4));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println("---------------\n");

        String numeros = "012345";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(2,4));

        String nomeSpacao = "   Luffy";
        System.out.println(nomeSpacao);
        System.out.println(nomeSpacao.trim());

    }
}
