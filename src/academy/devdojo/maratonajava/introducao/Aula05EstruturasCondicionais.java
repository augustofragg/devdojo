package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade <= 18;


        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }

        boolean c = false;

        if(c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
