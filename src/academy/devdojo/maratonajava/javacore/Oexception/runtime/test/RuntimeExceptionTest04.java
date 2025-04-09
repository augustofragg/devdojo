package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    /*
     * Multiplos catch
     * Estrutura try-catch, para captura de multiplas exceções
     * Cada Exceção tem que ser filha de exception ou runtimeExeption
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        // Multiplos catch
        // Estrutura try-catch, para captura de multiplas exceções
        // Cada exceção tem que ser filha de exception ou runtimeException

        try {

            throw new RuntimeException();

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException ");

        } catch(IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException ");

        } catch(IllegalArgumentException e) {
            System.out.println("Dentro do illegalArgumentException");

        } catch(ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");

        } catch(RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        //Concatenando exceções
        try {
            throw new RuntimeException();
        }
        catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e");
        }
        catch(RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }


        //Multiplos catch com exceções checked
        //subclasses de exception

        try {
            talvezLanceException();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            talvezLanceException();
        }
        catch(IOException | SQLException e) {
            e.printStackTrace();
        }


    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
