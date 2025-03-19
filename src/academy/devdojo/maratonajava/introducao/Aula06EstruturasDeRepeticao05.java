package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcelas = 0;

        for (int i = (int)valorCarro; i >= 1; i--) {

            valorParcelas = valorCarro/i;
            if(valorParcelas < 1000) {
                continue;
            }

            System.out.println("Parcela " + i + " Valor: R$ " + valorParcelas);
        }
        System.out.println();

        //Contagem

        for (int i = 0; i <=10; i++) {

            if(i == 6) {
                continue;
            }

            System.out.println("i: " + i);
        }

    }
}
