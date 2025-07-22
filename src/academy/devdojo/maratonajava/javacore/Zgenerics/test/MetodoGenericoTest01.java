package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        List<Barco> barcoList = List.of(new Barco("Canoa Marota"));
        criarArrayComUmObjeto(barcoList);

        List<Barco> barcoListb = criarArrayComUmObjetoRetorno(new Barco("Lancha"));
        System.out.println(barcoListb);
    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

    private static <T> List<T> criarArrayComUmObjetoRetorno(T t) {
        return List.of(t);
    }
}
