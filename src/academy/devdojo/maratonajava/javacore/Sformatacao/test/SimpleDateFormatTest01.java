package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {


        //format: Gera uma String formatada com base no padrao data
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dataFormatada = sdf.format(new Date());

        System.out.println(dataFormatada);

        String patternB = "'Amsterdan' dd 'de' MMMM 'de' yyyyy";
        SimpleDateFormat sdf1 = new SimpleDateFormat(patternB);
        String dataFormatadaB = sdf1.format(new Date());

        System.out.println(dataFormatadaB);
        System.out.println();

        String patternC = "HH:mm dd/MM/yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(patternC);

        String dataFormatadaC = "15:25 15/04/2025";
        try {
            Date date = sdf2.parse(dataFormatadaC);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
