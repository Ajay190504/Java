package keywords.statickeyword;

class HDFCBank {

    // Static Variable (shared by all customers)
    static String bankName;
    static double interestRate;

    String customerName;
    double balance;

    // Static Block (executes once class loads)
    static {
        bankName = "HDFC Bank";
        interestRate = 7.5;
        System.out.println("Bank system initialized");
    }

    HDFCBank(String name, double balance) {
        this.customerName = name;
        this.balance = balance;
    }

    // Static Method (belongs to class)
    static void changeInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to " + interestRate + "%");
    }

    void display() {
        System.out.println(bankName + " " + customerName +
                "  Balance: " + balance +
                " Interest: " + interestRate + "%");
    }

    public static void main(String[] args) {

        HDFCBank c1 = new HDFCBank("Ajay", 50000);
        HDFCBank c2 = new HDFCBank("Sujay", 80000);

        c1.display();
        c2.display();
        System.out.println();
        System.out.println("Updating Interest Rate ");
        HDFCBank.changeInterestRate(8.0);

        c1.display();
        c2.display();
    }
}