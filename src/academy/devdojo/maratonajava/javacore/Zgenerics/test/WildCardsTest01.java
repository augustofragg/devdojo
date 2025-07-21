package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consulta do Cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consulta do Gatinho");
    }
}


public class WildCardsTest01 {
    public static void main(String[] args) {

        //Exemplo com Arrays
        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        //Chamando o metodo
        printConsulta(cachorros);
        printConsulta(gatos);

        Animal[] animais = {new Gato(), new Cachorro()};
        printConsulta(animais);
    }

    private static void printConsulta(Animal[] animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }

        //animais[1] = new Gato();
        System.out.println("---------------");
    }
}
