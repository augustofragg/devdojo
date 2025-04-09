package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.IOException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("Salvando Funcionario");
    }
}
