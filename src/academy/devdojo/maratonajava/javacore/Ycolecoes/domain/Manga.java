package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(@NotNull Manga outroManga) {
        // negativo se o this < outroManga
        // se this == outroManga, return 0
        // posivito se this > outro manga

        //Exemplo 1
//        if(this.id < outroManga.getId()) {
//            return -1;
//        }
//        else if(this.id.equals(outroManga.getId())) {
//            return  0;
//        }
//        else {
//            return 1;
//        }

        //Exemplo 2
//        return this.id.compareTo(outroManga.getId());

        //Exemplo 3 por preco
//        return Double.valueOf(this.preco).compareTo(outroManga.getPreco());

        //Exemplo 4 por preco (Mais simples)
//        return Double.compare(this.preco, outroManga.getPreco());

        return this.nome.compareTo(outroManga.nome);
    }
}
