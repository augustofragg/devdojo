package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
//        map.put("vc","você");
        map.put("vc","você");//Ira sobreescrever o de cima
        System.out.println(map);

        //Iterando sobre o map

        //Exemplo 1
        System.out.println("-----------");
        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        //Exemplo2
        System.out.println("------------");
        for(String value : map.values()) {
            System.out.println(value);
        }

        //Exemplo 3
        System.out.println("------------");
        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " +  entry.getValue());
        }
    }
}
