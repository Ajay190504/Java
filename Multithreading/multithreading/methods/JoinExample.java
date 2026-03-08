package multithreading.methods;

public class JoinExample {

    public static void main(String[] args) throws Exception {

        JoinThread t1 = new JoinThread();
        t1.start();

        t1.join();   // main thread waits

        System.out.println("Main thread finished");
    }
}