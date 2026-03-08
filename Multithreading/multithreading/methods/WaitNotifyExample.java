package multithreading.methods;

public class WaitNotifyExample {

    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.print());
        Thread t2 = new Thread(() -> obj.print());

        t1.start();
        t2.start();
    }
}