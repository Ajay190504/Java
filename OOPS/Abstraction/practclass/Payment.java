package abstraction.practclass;

abstract class Payment {

    abstract void authenticate();
    abstract void process(double amount);

    void receipt() {
        System.out.println("Receipt Generated");
    }
}