package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodeos;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodeos = new int[100];

        for (int i = 0; i < episodeos.length; i++) {
            episodeos[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 3");
    }

    {
        System.out.println("Dentro do bloco de iniciazação nao estatico");
    }

    public Anime() {
        for(int episodio : Anime.episodeos) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
