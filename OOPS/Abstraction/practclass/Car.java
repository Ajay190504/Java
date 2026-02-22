package abstraction.practclass;


class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " car starts with ignition");
    }

    public static void main(String[] args) {
        Vehicle v = new Car("Toyota");
        v.start();
        v.stop();
    }
}
