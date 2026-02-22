package abstraction.practclass;

class SBI extends Bank {

    @Override
    void calculateInterest() {
        System.out.println("Interest calculated at 8%");
    }

    public static void main(String[] args) {
        Bank bank = new SBI();
        bank.processLoan();
    }
}