package academy.devdojo.maratonajava.introducao;

/*
    Exercicio Pratico

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no <endereço>,
    confirmo que recebi o salário de <salário>, na data <data>

 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String name = "Goku";
        String address = "Terra";
        String date = "18/03/2025";
        double salary = 3000.00;

        String relatorio = "Eu " + name + ", morando no " + address + "\nconfirmo que recebi o salario de " + salary + ", na data " + date ;

        System.out.println(relatorio);


    }
}
