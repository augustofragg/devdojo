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
        System.out.println(resultadoSoma);

        int resultadoMult = numero01 * numero02;
        System.out.println(resultadoMult);

        //A divisão entre dois inteiros é um inteiro
//        double resultadoDouble = numero01 / numero02;
//        System.out.println(resultadoDouble);

        // Mas caso haja com valor tipo double o resultado sere em double
        double resultadoDouble =   numero01 / (double) numero02;
        System.out.println(resultadoDouble);






    }
}
