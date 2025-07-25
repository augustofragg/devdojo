package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

//        Limpa o array sem excluir a referencia
//        smartphones.clear();

        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        System.out.println("-------------------------");

        Smartphone s4 = new Smartphone("22222", "Pixel");

//      Metodo contains verifica se um objeto existe
        System.out.println(smartphones.contains(s4));

//      Metodo indexOf retorna o indice do objeto na lista
        int indexSmarthPhone = smartphones.indexOf(s4);
        System.out.println(indexSmarthPhone);
        System.out.println(smartphones.get(indexSmarthPhone));



    }
}
