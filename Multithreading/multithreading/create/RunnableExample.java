package multithreading.create;

public class RunnableExample {

    public static void main(String[] args) {

        Task task = new Task();
        Thread t1 = new Thread(task);
        t1.start();
    }
}