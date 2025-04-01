package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

//      Acessar uma propriedade estática atravês de um objeto não é recomendado
//      System.out.println(carro.VELOCIDADE_LIMITE);

//      Acessa-se a propriede estática pela classe

        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.comprador);
        carro.comprador.setNome("Kuririn");

        System.out.println(carro.comprador);

        final Comprador comp = new Comprador();
        comp.setNome("Oi");

        System.out.println(comp.toString());


        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
