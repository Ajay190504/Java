package multithreading.master;

class SharedBuffer {
    private int data;
    private boolean available = false;

    // Producer puts data
    public synchronized void put(int value) {
        while (available) {  // wait if buffer is full
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
        data = value;
        available = true;
        System.out.println(Thread.currentThread().getName() + " produced: " + data);
        notify();  // wake up consumer
    }

 // Consumer gets data
    public synchronized int get() {
        while (!available) { // wait if buffer is empty
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
        available = false;
        System.out.println(Thread.currentThread().getName() + " consumed: " + data);
        notify();  // wake up producer
        return data;
    }
}