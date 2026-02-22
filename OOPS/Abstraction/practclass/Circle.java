package abstraction.practclass;

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Shape s = new Circle(5);
        s.display();
        System.out.println("Area: " + s.area());
    }
}