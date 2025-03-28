package academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salary;
    private double media;

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

        for(double s : this.salary) {
            media += s;
        }

        media /= this.salary.length;

        System.out.println("Average salary: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getMedia() {
        return media;
    }

//    Nem todos as propriedades da classe devem os metodos get ou set
//    Depende do caso
//    public void setMedia(double media) {
//        this.media = media;
//    }
}
