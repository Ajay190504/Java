package multithreading.master;

import multithreading.master.ConsumerRunnable;
import multithreading.master.ProducerThread;
import multithreading.master.SharedBuffer;

public class MasterThreadExample {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer();

        ProducerThread producer = new ProducerThread(buffer);
        Thread consumer = new Thread(new ConsumerRunnable(buffer), "ConsumerThread");

        // Start threads
        producer.start();
        consumer.start();

        // Wait for both threads to finish
        producer.join();
        consumer.join();

        System.out.println("Both Producer and Consumer have finished execution.");
    }
}