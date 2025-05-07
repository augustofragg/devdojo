package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        //Classe localTime

        LocalTime localTime = LocalTime.of(23,32,12);
        System.out.println("LocalTime: " + localTime);

        LocalTime timeNow = LocalTime.now();
        System.out.println("TimeNow: " + timeNow);

        //Classe LocalTime - Metodos
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);


    }
}
