package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        //Aula Relativize

        // Ex.: 1
        Path dir = Paths.get("/home/william");
        Path clazz = Paths.get("/home/william/devdojofoda/OlaMundo.java");
        Path pathToClass = dir.relativize(clazz);
        System.out.println(pathToClass);

        // Ex.: 2
        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/william/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");


        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));

        System.out.println("3 " + absoluto1.relativize(absoluto2));

        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("4 " + relativo2.relativize(relativo1));

    }
}
