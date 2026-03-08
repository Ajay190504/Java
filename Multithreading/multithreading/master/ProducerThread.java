package multithreading.master;

import multithreading.master.SharedBuffer;

//Producer Thread using Thread class
class ProducerThread extends Thread {
private SharedBuffer buffer;

public ProducerThread(SharedBuffer buffer) {
   super("ProducerThread");
   this.buffer = buffer;
}

public void run() {
   for (int i = 1; i <= 5; i++) {
       buffer.put(i);
       try {
           Thread.sleep(500); // simulate production time
       } catch (InterruptedException e) {}
   }
}
}
