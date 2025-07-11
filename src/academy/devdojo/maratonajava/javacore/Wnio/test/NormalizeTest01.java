package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        // Diretorio sem o normalize
        String diretorioProjeto = "Home/willian/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto,arquivoTxt);

        System.out.println(path1);

        // Diretorio com o normalize
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./willian/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
