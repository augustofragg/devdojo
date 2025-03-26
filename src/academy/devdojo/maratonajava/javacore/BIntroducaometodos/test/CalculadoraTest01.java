package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        //Instanciando a classe calculadora
        Calculadora calculadora = new Calculadora();

        //Chamando o metodo somar dois numeros que está
        //na classe calculadora
        calculadora.somarDoisNumeros();

        //Chamdando o segundo metodo
        calculadora.subtrairDoisNumeros();

        System.out.println("Finalizando Programa");
    }
}
