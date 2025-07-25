package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//BufferedWriter incapsula o fileWriter
//Tem uma performace superior ao fileWriter


public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            bw.write("Hello World!Proxima Linha");
            bw.newLine();// Metodo para pular linha
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
