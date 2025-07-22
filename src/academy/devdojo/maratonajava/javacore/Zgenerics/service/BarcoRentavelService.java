package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> BarcosDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"),new Barco("Canoa")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando Barco disponivel......");
        Barco Barco = BarcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + Barco);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(BarcosDisponiveis);
        return Barco;
    }

    public void retornarBarcoAlugado(Barco Barco) {
        System.out.println("Devolvendo Barco " + Barco);
        BarcosDisponiveis.add(Barco);
        System.out.println(BarcosDisponiveis);
    }
}
