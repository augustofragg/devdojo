package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantilç
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria;

        if(idade < 15) {
            categoria = "Categoria Infantil";
        }
        else if(idade >= 15 && idade < 18) {
            categoria = "Categoria Infantil";
        }
        else  {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);


    }
}
