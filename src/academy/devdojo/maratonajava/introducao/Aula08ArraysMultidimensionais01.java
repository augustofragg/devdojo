package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        // 1, 2, 3, 4, 5 meses
        // 31, 28, 31, 30 dias

        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 28;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 28;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 28;

//        for (int i = 0; i < dias.length; i++) {
//            System.out.println("-------");
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.print(dias[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int[] arrayBase : dias) {
            System.out.println("----------");
            for(int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
