package abstraction.practclass;

class UPI extends Payment {

    @Override
    void authenticate() {
        System.out.println("Authenticated via UPI PIN");
    }

    @Override
    void process(double amount) {
        System.out.println("Processed payment of " + amount);
    }

    public static void main(String[] args) {
        Payment p = new UPI();
        p.authenticate();
        p.process(2000);
        p.receipt();
    }
}