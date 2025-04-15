package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        //Classe para internacionalização
        Locale localeItaly = new Locale("it","IT");
        Locale localeCh = new Locale("it","CH");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapao = new Locale("ja","JP");
        Locale localeHolanda = new Locale("nl","NL");

        Calendar cal = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCh);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);

        System.out.println("Italia: " + df1.format(cal.getTime()));
        System.out.println("Suiça: " + df2.format(cal.getTime()));
        System.out.println("India: " + df3.format(cal.getTime()));
        System.out.println("Japao: " + df4.format(cal.getTime()));
        System.out.println("Holanda: " + df5.format(cal.getTime()));

        System.out.println();
        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeCh.getDisplayCountry(localeHolanda));
        System.out.println(localeItaly.getDisplayLanguage(localeJapao));


        //Metodo para padronização
        Locale.setDefault(Locale.US);
    }
}
