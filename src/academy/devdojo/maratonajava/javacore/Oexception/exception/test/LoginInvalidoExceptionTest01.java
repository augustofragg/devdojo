package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        }
        catch(LoginInvalidoException e) {
            e.printStackTrace();
            System.out.println("Login ou senha invalida");
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("Login");
        String usernameInput = sc.nextLine();
        System.out.println("Senha");
        String passwordInput = sc.nextLine();

        if(!usernameDB.equals(usernameInput) || !passwordDB.equals(passwordInput)) {
            throw  new LoginInvalidoException();
        }

        System.out.println("Usuário logado com sucesso");
    }
}
