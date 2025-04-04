package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi",290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

//      O atributo Faz parte da classe não da instancia
//      Carro.velocidadeLimite = 180;

//      Metodo statico
        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();

//      Metodo de statico
        System.out.println("Novo velocidade limite " + Carro.getVelocidadeLimite());



    }
}
