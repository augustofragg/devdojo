package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {

        //Collections método iguals

        // Ex.: 1
        // String nome = "Carlos Augusto";
        // String nome2 = "Carlos Augusto";
        // String nome3 = new String("Carlos Augusto");


        // == Compara referência endereço na memoria dos objetos;
        // Retorna verdadeiro pos valores literais ficam armarzenados no pool de strings
        // System.out.println(nome == nome2);// true

        // Retorna falso pois nome3 é uma referência que não está no pool de strings
        // System.out.println(nome == nome3);// false

        // Forma correta: Utilizar o método .eguals() -> compara o contedo
        // System.out.println(nome.equals(nome2)); //true
        // System.out.println(nome.equals(nome3)); //true

        //Ex.: 2

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "Pixel");

        System.out.println(s1.equals(s2));


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
