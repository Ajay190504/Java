package multithreading.master;

import multithreading.master.SharedBuffer;

//Consumer Thread using Runnable
class ConsumerRunnable implements Runnable {
private SharedBuffer buffer;

public ConsumerRunnable(SharedBuffer buffer) {
   this.buffer = buffer;
}

public void run() {
   for (int i = 1; i <= 5; i++) {
       buffer.get();
       try {
           Thread.sleep(700); // simulate consumption time
       } catch (InterruptedException e) {}
   }
}
}