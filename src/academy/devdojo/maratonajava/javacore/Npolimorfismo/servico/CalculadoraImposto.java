package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relátorio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador " + computador.getNome());
//        System.out.println("Valor " + computador.getValor());
//        System.out.println("Imposto a ser pago " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relátorio de imposto do computador");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Computador " + tomate.getNome());
//        System.out.println("Valor " + tomate.getValor());
//        System.out.println("Imposto a ser pago " + imposto);
//    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Retório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preco " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
//        Tomate tomate = (Tomate) produto;
        if(produto instanceof Tomate ) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de Validade " + dataValidade);
        }

    }
}
