package throwthrows;

public class ThrowExample {

    static void checkNumber(int num) {

        if(num < 0) {
            throw new ArithmeticException("Negative numbers are not allowed");
        }

        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {

        checkNumber(-5);
    }
}