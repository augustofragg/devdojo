package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected int valor;

    public Produto(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}
