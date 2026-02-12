package abstraction.practinterface;


class SimpleCalculator implements Calculator {

    public void add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide(double a, double b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
    public static void main(String[] args) {
        Calculator c = new SimpleCalculator();
        c.add(10, 5);
        c.subtract(10, 5);
        c.multiply(10, 5);
        c.divide(10, 5);
    }
}