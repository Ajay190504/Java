package throwthrows;

public class CustomThrowExample {

    static void withdraw(int amount) throws InvalidAmountException {

        if(amount <= 0) {
            throw new InvalidAmountException("Amount can't be negative or zero");
        }

        System.out.println("Transaction successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(7000);
        }

        catch(InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
