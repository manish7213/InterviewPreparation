package Multithreading_Concurrency;

public class ThreadJava8 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("This is another thread"));
        thread.start();
    }
}
