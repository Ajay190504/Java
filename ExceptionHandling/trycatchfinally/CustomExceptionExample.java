package trycatchfinally;

public class CustomExceptionExample {

    static void checkAge(int age) throws InvalidAgeException {

        if(age < 0){
            throw new InvalidAgeException("Age can't be negative");
        }

        System.out.println("Valid Age");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }

        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}