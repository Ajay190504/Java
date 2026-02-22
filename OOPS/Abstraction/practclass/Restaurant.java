package abstraction.practclass;

abstract class Restaurant {

    protected String name;

    Restaurant(String name) {
        this.name = name;
    }

    abstract void prepareFood();

    public void acceptOrder() {
        System.out.println("Order accepted at " + name);
    }
}