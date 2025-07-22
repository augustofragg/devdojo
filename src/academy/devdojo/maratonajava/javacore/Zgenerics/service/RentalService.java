package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando carro disponivel......");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + t);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(t);
        return t;
    }

    public  void retornarObjetosAlugado(T t) {
        System.out.println("Devolvendo carro " + t);
        objetosDisponiveis.add(t);
        System.out.println(t);
    }
}
