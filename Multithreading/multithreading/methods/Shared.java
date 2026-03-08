package multithreading.methods;

class Shared {

    synchronized void print() {

        for(int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                wait();
            }

            catch(Exception e) {}

            notify();
        }
    }
}