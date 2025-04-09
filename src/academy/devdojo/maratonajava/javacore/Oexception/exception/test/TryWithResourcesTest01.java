package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

        lerArquivo();

        //lerArquivo2();

    }

    /**
     * Metodo com tryWithResources
     */
    public static void lerArquivo() {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        }catch (IOException e) {
            System.out.println();
        }
    }

    /**
     * Metodo sem TryWithResources
     */
    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("arquivo\\teste.tx"));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
