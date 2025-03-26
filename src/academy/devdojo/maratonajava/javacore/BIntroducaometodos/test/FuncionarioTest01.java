package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Goky";
        funcionario.idade = 90;
        funcionario.salary = new double[]{5000.00,2000.00,8000.00};
//      funcionario.salary = null;

        //1. Imprimindo Dados de funcionario e a media
        funcionario.imprimir();



    }
}
