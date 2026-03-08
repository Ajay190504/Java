package multithreading.methods;

public class DaemonExample {

    public static void main(String[] args) {

        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();

        t1.setDaemon(true);

        t1.start();
        t2.start();
    }
}