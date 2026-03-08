package multithreading.create;

class Task implements Runnable {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}