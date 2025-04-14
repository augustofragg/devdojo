package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "Augusto"; //String constant pool
        String nome2 = "Augusto";

        //Validacao de referencia do objeto
        boolean isIgualsRef = nome == nome2;
        System.out.println("IsIgualsRed: " + isIgualsRef);

        String nome3 = new String("Augusto");
        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());

        //E necessario a criação de uma nova referencia para alterar
        nome = nome.concat(" Fragg");
        System.out.println(nome);

        isIgualsRef = nome == nome2;
        System.out.println("isIgualsRef: " + isIgualsRef);






    }
}
