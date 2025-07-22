package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest02 {

    private String name = "Midorirya";

    void print() {
        String lastName = "Izuku";

        //Declarando classe Local: classe Dentro de um metodo ou inicializador estático
        //Modificador de acesso: só pode usar: abstratic e final
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }


    public static void main(String[] args) {
        //Local class
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
