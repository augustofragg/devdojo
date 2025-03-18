package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        //Operadores básicos
        // + - / *

        int numero01 = 10;
        int numero02 = 20;

        //Quando o compilador do java analisa dois valores numerericos entre o operador +
        //Ele realiza a soma, mas caso contenha uma string, ele passa a concatenar

        System.out.println(numero02 + numero01);
        System.out.println(numero02 + numero01 + "Valor " + numero02 + numero01);
        System.out.println();

        int resultadoSoma = numero01 + numero02;
        int resultadoSubtracao = numero01 - numero02;
        int resultadoMult = numero01 * numero02;

        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMult);


        //A divisão entre dois inteiros é um inteiro
        //double resultadoDouble = numero01 / numero02;
        //System.out.println(resultadoDouble);

        // Mas caso haja com valor tipo double o resultado sera em double
        double resultadoDouble =   numero01 / (double) numero02;
        System.out.println(resultadoDouble);
        System.out.println("\n---------------------");

        // Operadore de resto da divisao
        int resto = 20 % 2; // 20 é par

        System.out.println(resto);

        resto = 13 % 2; // 13 é impar
        System.out.println(resto);

        System.out.println("\n---------------------");
        //Operaroes lógicos
        // <  >  >=  <=  === !==

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;


        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIqualVinte: " + isDezIgualVinte);
        System.out.println("IsDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);


        //Operadores lógicos

        // && (AND)  || (or)  !(negacao)

        int idade = 35;
        float salario = 3500f;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMennorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        System.out.println("\n------------------------");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
    }
}
