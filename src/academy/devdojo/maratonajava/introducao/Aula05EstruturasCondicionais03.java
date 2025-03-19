package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000

        double salario = 8000;

        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNãoDoar = "Ainda não tenho condições";

        //(condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);
        System.out.println();

        //Exemplo 2

        int idade = 17;
        String categoria = (idade < 15) ? "Categoria Infantil" :
                (idade >= 15 && idade < 18) ? "Categoria Juvenil" : "Categoria Adulto";

        System.out.println(categoria);

    }
}
