package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // Valores padroes na inicialização de variaveis
        // byte, short, int, long, float e double
        // char 'u\000' ' '
        // boolean false
        // String null

//        int[] inters = new int[3];
//        System.out.println(inters[0]);
//        System.out.println(inters[1]);
//        System.out.println(inters[2]);
//
//        char[] chars = new char[3];
//        System.out.println(chars[0]);
//        System.out.println(chars[1]);
//        System.out.println(chars[2]);
//
//        boolean[] bools = new boolean[3];
//        System.out.println(bools[0]);
//        System.out.println(bools[1]);
//        System.out.println(bools[2]);
//
//        String[] strings = new String[3];
//        System.out.println(strings[0]);
//        System.out.println(strings[1]);
//        System.out.println(strings[2]);


        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //Esse comando faz com que a variavel aponte para um novo
        //local da memoria, a referencia antiga é apagada pelo
        //garbage collector
        nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }



    }
}
