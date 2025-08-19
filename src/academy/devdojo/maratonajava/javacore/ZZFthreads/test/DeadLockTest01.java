package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "### Fora");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "#### Dentro");
                }
            }
        };

//        Codigo que gera deadlock
//        Runnable r2 = () -> {
//            synchronized (lock2) {
//                System.out.println(Thread.currentThread().getName() + "### Fora");
//                synchronized (lock1) {
//                    System.out.println(Thread.currentThread().getName() + "#### Dentro");
//                }
//            }
//        };


        Runnable r2 = () -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "### Fora");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "#### Dentro");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();



    }
}
