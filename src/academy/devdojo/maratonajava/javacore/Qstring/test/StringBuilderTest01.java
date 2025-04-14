package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Carlos Augusto";

        nome = nome.concat(" Desenvolvedor junior");
        System.out.println(nome);

        nome = nome.substring(0,4);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Carlos Augusto");
        sb.append(" Desenvolvedor").append(" Junior");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);

    }
}
