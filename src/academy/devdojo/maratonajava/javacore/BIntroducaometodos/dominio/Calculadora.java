package academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
//        if(num2 == 0) {
//            return 0;
//        } else {
//            return num1 / num2;
//        }

        if(num2 != 0) {
            return num1 / num2;
        }

        return 0;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alterarDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }

    public void somarArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somarVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

//    public void somarVarArgs(double test, int... numeros) {
//        int soma = 0;
//        for(int num : numeros) {
//            soma += num;
//        }
//
//        System.out.println(test);
//        System.out.println(soma);
//    }
}








