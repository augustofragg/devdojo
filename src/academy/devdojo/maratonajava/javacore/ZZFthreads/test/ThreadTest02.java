package academy.devdojo.maratonajava.javacore.ZZFthreads.test;


// Aula 223 - Threads pt 04 - Yield e Join



class ThreadExampleRunnableb implements Runnable {
    private final String c;

    public ThreadExampleRunnableb(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i % 100 == 0) {
                System.out.println();
            }
            // Thread.yield(); Da uma dica para o escalonador pula a thread, (Sem garantia)
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

//Aula 220 - Threads pt 01 - Introduction

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnableb("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnableb("ME"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();

    }
}




















