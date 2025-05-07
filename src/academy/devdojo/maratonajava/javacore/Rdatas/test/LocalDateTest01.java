package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        //Classe Date
        System.out.println(new Date());

        //Classe Calendar
        System.out.println(Calendar.getInstance());

        //Class Month
        System.out.println(Month.JANUARY.getValue());

        //Classe LocalDate
        LocalDate localDate = LocalDate.of(2022,Month.JANUARY,27);
        System.out.println("Data criada: " +  localDate);

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        //LocalDate cria um outro objeto quando a modificação
        LocalDate agora = LocalDate.now();
        System.out.println("Agora: " + agora);

        agora = agora.plusWeeks(4);
        System.out.println("Acrescentando mais 4 : " + agora);

        System.out.println(localDate);
        System.out.println(agora);

    }
}
