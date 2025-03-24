package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //Formas de inicializar um array
        int[] numeros = new int[3];

        int[] numeros2 = {1,2,3,4,5};

        int[] numeros3 = new int[]{1,2,3,4,5,6};

        //Modo padrao para percorrer um array
        for (int i = 0; i < numeros2.length ; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println();

        //Com for each
        for(int num : numeros2) {
            System.out.println(num);
        }
        System.out.println();

        for(int num: numeros3) {
            System.out.println(num);
        }
    }
}
