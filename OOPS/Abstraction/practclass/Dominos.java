package abstraction.practclass;

class Dominos extends Restaurant {

    Dominos(String name) {
        super(name);
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Pizza at " + name);
    }

    public static void main(String[] args) {

        Restaurant r = new Dominos("Dominos Mumbai");
        r.acceptOrder();
        r.prepareFood();
    }
}