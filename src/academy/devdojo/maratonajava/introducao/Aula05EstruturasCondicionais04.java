package academy.devdojo.maratonajava.introducao;


public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;

        double salarioAnual = 70000;
        double imposto = 0;

        if(salarioAnual <= 34712) {
           imposto = salarioAnual * primeiraFaixa;
        }
        else if(salarioAnual >= 34713 && salarioAnual <= 68507) {
            imposto = salarioAnual *  segundaFaixa;
        }
        else if(salarioAnual >= 68508) {
            imposto = salarioAnual *  terceiraFaixa;
        }

        System.out.println("Salario: $ " + salarioAnual);
        System.out.println("Imposto: $ " + imposto);

    }
}
