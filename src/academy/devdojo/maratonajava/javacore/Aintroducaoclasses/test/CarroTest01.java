package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nome = "Ford";
        carro1.modelo = "Ka sedan";
        carro1.ano = 2018;

        carro2.nome = "BMW";
        carro2.modelo = "X2";
        carro2.ano = 2020;

        //Carro1 referenciando carro2
        //carro1 = carro2;

        System.out.println("Carro 1 ");
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);

        System.out.println("\nCarro 2 ");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);



    }
}
