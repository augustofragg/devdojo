package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {

        //Resultara no erro StackOverFlow
        //Quando a chamada recursiva passa do limite
        //Da pilha de chamadas stack

        recursividade();
    }

    private static void recursividade() {
        recursividade();
    }

}
