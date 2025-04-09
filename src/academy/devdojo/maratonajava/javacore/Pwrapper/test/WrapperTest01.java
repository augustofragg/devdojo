package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        //Classes Wrapper

        //Tipos primitivos
        byte bytep = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10f;
        double doubleP = 180;
        char charP = 'W';
        boolean booleanP = false;

        //Tipos wrappes

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10f;
        Double doubleW = 180D;
        Character charW = 'W';
        Boolean booleanW = false;

        //boxing ou autoboxing
        Integer numW =  90;

        //Unboxing
        int numP =  numW;

        System.out.println("Wrapper: " + numW +"\nPrimitiv: " + numP);

        //Classes Wrapper Metodos

        //String -> Integer

        Integer numWb = Integer.parseInt("10");
        System.out.println(numWb);

        //String -> boolean: IgnoreCase
        Boolean booleanWb = Boolean.valueOf("TRue");
        System.out.println(booleanWb);

        booleanWb = Boolean.parseBoolean(null);
        System.out.println(booleanWb);

        System.out.println();

        //Character
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
