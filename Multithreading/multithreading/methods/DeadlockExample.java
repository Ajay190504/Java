package multithreading.methods;

public class DeadlockExample {

    public static void main(String[] args) {

        Resource res1 = new Resource("Resource1");
        Resource res2 = new Resource("Resource2");

        Thread t1 = new Thread(() -> res1.use(res2), "Thread-1");
        Thread t2 = new Thread(() -> res2.use(res1), "Thread-2");

        t1.start();
        t2.start();
    }
}