package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildCardsTest02 {
    public static void main(String[] args) {

        //Exemplo com Listas
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Animal> animals = List.of(new Cachorro(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);
        printConsulta(animals);

//        printConsultaAnimal(cachorros);
//        printConsultaAnimal(gatos);
        printConsultaAnimal(animals);

    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

        System.out.println("---------------");
    }

    //Nesse metodo pode-se adicionar elemento na lista
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
