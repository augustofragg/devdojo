package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5,6,7};

        calculadora.somarArray(numeros);

        // Função utilizando VarArgs
        calculadora.somarVarArgs(0,2,23,4);
    }
}
