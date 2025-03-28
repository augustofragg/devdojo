package academy.devdojo.maratonajava.javacore.BIntroducaometodos.test;

import academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        //Definindo propriedades do objeto com setters
        pessoa.setName("Jiraya");
        pessoa.setIdade(30);
        //pessoa.setIdade(-1);

        //Pelo metodo proprio da classe
        pessoa.imprimir();
        System.out.println("-------------------");

        //Acessando as propriedaes com getters
        String nome = pessoa.getName();
        int idade = pessoa.getIdade();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
}
