package academy.devdojo.maratonajava.javacore.Wnio.test;


import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
    // Aula resolvendo paths

        /*
         * Caminhos
         *
         * Absoluto home/willian -> na raiz
         *
         * Relativo /home/william -> relativo a raiz
         *
         */

        // Exemplo 1
        Path dir = Paths.get("home/william");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        // Exemplo 2

        Path absoluto = Paths.get("/home/william");
        Path relativo = Paths.get("dev");

        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));

        // O metodo resolve não altera o path absoluto
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));

        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));


    }
}



















