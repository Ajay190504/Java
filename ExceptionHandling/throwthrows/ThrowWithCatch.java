package throwthrows;

public class ThrowWithCatch {

    static void validateAge(int age) {

        if(age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            validateAge(16);
        }

        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
