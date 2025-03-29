package academy.devdojo.maratonajava.javacore.Dcontrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;
    private String studio;

    //Construtor padrão
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    //Construtor sobrecarregado
    public Anime(String nome, String tipo, int episodeos, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodeos, String genero, String studio) {
        this(nome,tipo,episodeos,genero);
        this.studio = studio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodeos);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public int getEpisodeos() {
        return episodeos;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}