package multithreading.create;

public class ThreadExample {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}