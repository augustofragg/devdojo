package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos Primitivos
        // int, double, float, char, byte, short, long, boolean

        //Padrao camelCase na criacao de variaveis

        int age = 10;
        long numeroGrande = 100000000;

        //Numeros decimais
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;

        //Valores numericos
        byte idadeByte = 10;
        short idadeShort = 10;

        boolean verdadeiro = true;
        boolean falso = false;

//        char caracter = 'a';

        char caracter = 87;

        char caracterUniCode = '\u0041';

        System.out.println("A idade é " + age + " anos ");

        System.out.println("boolean: " + verdadeiro);

        System.out.println("Caracter " + caracter);

        System.out.println("Caracter unicode " + caracterUniCode);


        // Casting
        //Long para int
        int num = (int) 100000000000L;

        System.out.println("\nLong para int: " + num);

        //Double para int
        int numD = (int) 12.267;

        System.out.println("\nDouble para int: " + numD);

        //Double para float sem alteracao

        float numFloat = (float) 155.234D;

        System.out.println("\nDouble para float: " + numFloat);


        //Inferência de Tipos
//        var car = "Mercedes";
//        var height = 1.73;
//
//        System.out.println("\ncar: " + car + "\nHeight: " + height);


        //String

        String nome = "Goku";

        System.out.println("\nString nome: " + nome);







    }
}
