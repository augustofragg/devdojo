package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        //break interrompe o laço de repeticao

        int maxValue = 25;

        for(int i = 0; i <= 100; i++) {

            if(i == maxValue) {
                System.out.println(i);
                break;
            }

        }
    }
}
