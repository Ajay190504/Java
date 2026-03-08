package multithreading.methods;

class Resource {
    String name;

    Resource(String name) {
        this.name = name;
    }

    synchronized void use(Resource r) {
        System.out.println(Thread.currentThread().getName() + " locked " + this.name);

        try {
            Thread.sleep(500);  // Simulate work
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() + " trying to lock " + r.name);
        synchronized (r) {
            System.out.println(Thread.currentThread().getName() + " locked " + r.name);
        }
    }
}

