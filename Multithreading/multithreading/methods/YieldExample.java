package multithreading.methods;

public class YieldExample {

    public static void main(String[] args) {

        YieldThread t1 = new YieldThread();
        YieldThread t2 = new YieldThread();

        t1.start();
        t2.start();
    }
}