package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalary(new double[]{1200,987.32,2000});
        funcionario.imprimir();
        System.out.println("Média " + funcionario.getMedia());


    }
}
