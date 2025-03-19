package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000


        double valorCarro = 30000;
        double valorParcelas = 0;

        for (int i = 1; i <= valorCarro; i++) {

            valorParcelas = valorCarro/i;
            if(valorParcelas < 1000) {
                break;
            }

            System.out.println("Parcela " + i + " Valor: R$ " + valorParcelas);
        }

    }
}
