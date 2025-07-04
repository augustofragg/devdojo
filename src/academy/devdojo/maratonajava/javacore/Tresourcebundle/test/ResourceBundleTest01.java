package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("en","US"));

        // Ingles dos Eua -> en_US
        System.out.println(bundle.containsKey("hello"));
        System.out.println(bundle.containsKey("good.morning"));

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Fallback exemplo
        System.out.println(bundle.getString("hi"));

        System.out.println("\n----------------");
        // Portugues do Brasil pt_BR

        bundle = ResourceBundle.getBundle("messages", new Locale("pt","BR"));

        System.out.println(bundle.containsKey("hello"));
        System.out.println(bundle.containsKey("good.morning"));

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Fallback exemplo
        System.out.println(bundle.getString("hi"));
    }
}
