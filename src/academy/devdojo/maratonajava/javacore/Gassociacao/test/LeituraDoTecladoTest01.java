package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Idade: ");
        int age = sc.nextInt();

        System.out.print("Sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.print("Altura: ");
        double height = sc.nextDouble();

        System.out.println("\n-------Informacoes---------");

        System.out.println(name);
        System.out.println(age);
        System.out.println(sexo);
        System.out.printf("%.2f",height);

        sc.close();
    }
}
