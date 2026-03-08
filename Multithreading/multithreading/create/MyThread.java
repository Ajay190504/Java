package multithreading.create;

class MyThread extends Thread {

    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}