package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassTest01 {

    private String name = "Monkey D. Luffy";

    //Declarando classe interna
    class Inner  {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println("Contexto da classe Onde se encontra: " + this);
            System.out.println("Contexto da classe externa " + OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        //Criando objeto da classe Interna

        //Exemplo 1
        OuterClassTest01 outerClassTest = new OuterClassTest01();

        Inner inner = outerClassTest.new Inner();
        inner.printOuterClassAttribute();

        Inner inner2 = new OuterClassTest01().new Inner();
        inner2.printOuterClassAttribute();

    }
}
