package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    //Bloco de inicialização
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    // Sobre escrita de metodo
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

        Pessoa pessoa = new Pessoa();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
