package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        //Calendar
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);

        //Calendar primeiro dia da semana
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }

        //Retorno dias com Calendar
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //Adicao de dias
        c.add(Calendar.DAY_OF_MONTH,2);
        System.out.println(c.getTime());

        //Acicao de horas
        c.add(Calendar.HOUR_OF_DAY,2);
        System.out.println(c.getTime());
    }
}
