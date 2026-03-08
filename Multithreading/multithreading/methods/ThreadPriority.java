package multithreading.methods;

class ThreadPriority extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                           " Priority: " + Thread.currentThread().getPriority());
    }
}