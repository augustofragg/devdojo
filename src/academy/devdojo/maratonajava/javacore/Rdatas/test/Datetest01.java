package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class Datetest01 {
    public static void main(String[] args) {

        //Classe Date - não é mais utilizada só em legado
        Date date = new Date();
        System.out.println(date);

        //Date: começa em 01/01/1970
        date = new Date(1000_000_000L);
        System.out.println(date);

        //Acrescentando hora no date
        Date dateHour = new Date();
        dateHour.setTime(dateHour.getTime() + 3_600_000);

        System.out.println(dateHour);


        //Conta o tempo a partir de millisegundos



    }
}
