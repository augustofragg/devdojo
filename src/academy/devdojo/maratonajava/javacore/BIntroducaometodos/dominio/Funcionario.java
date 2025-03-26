package academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salary;

    public void imprimir() {
        if(salary == null) {
            return;
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(int i = 0; i < salary.length; i++) {
            System.out.println("Salario " + (i+1) + " : " + salary[i]);
        }
        avarageSalary();
    }

    public void avarageSalary() {
        if(salary == null) {
            return;
        }
        double sum = 0;
        for(double s : this.salary) {
            sum += s;
        }

        sum /= this.salary.length;

        System.out.println("Average salary: " + sum);
    }
}
