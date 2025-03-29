package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodeos;
    // 1 - Alocado em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do inicializador");
        episodeos = new int[100];

        for (int i = 0; i < episodeos.length; i++) {
            episodeos[i] = i + 1;
        }

        for(int episodio : this.episodeos) {
            System.out.print(episodio + " ");
        }
    }

    public Anime() {
        System.out.println("\nDentro do construtor");
        episodeos = new int[100];

        for (int i = 0; i < episodeos.length; i++) {
            episodeos[i] = i + 1;
        }

        for(int episodio : this.episodeos) {
            System.out.print(episodio + " ");
        }
    }
}
