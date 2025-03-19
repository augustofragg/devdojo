package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

        int max = 1000000;

        int total = 0;

        for(int i = 0;i <= max;i++) {

            if(i % 2 == 0) {
                System.out.println(i);
                total++;
            }

        }

        System.out.println(total);


    }
}
