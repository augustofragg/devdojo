package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O grande sofware de previsão do futuro");
        System.out.println("Digite sua pergunte e eu responderei sim ou nao");
        String pergunta = sc.nextLine();

        if(pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        }
        else {
            System.out.println("Não");
        }

        sc.close();
    }
}
