package abstraction.practclass;

abstract class Vehicle {

    String brand;

    Vehicle(String brand) {      // Constructor in abstract class
        this.brand = brand;
    }

    abstract void start();       // Abstract method

    void stop() {                // Concrete method
        System.out.println("Vehicle stopped");
    }
}


