package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        //Declarando um array de objetos
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        //Iterar sobre o array de objetos -> alt + enter

        for (Jogador jogador : jogadores) {
            jogador.Imprimir();
        }


    }
}
