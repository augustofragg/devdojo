package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {

        //Classe Duration
        //Trabalha com Tempo: Hora, Segundo, minuto e millesegundo

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinusHours = LocalTime.now().minusHours(2);

        Duration d1 = Duration.between(now,nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow,timeNowMinusHours);
        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);





    }
}
