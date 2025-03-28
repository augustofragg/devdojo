package academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio;

public class Pessoa {
    private String name;
    private int idade;

    public void imprimir() {
        System.out.println(this.name);
        System.out.println(this.idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if(idade < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }
}
