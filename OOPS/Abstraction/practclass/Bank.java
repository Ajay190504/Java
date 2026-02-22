package abstraction.practclass;

abstract class Bank {

    final void processLoan() {       // Template method (cannot be overridden)
        verifyDocuments();
        calculateInterest();
        approveLoan();
    }

    private void verifyDocuments() {
        System.out.println("Documents verified");
    }

    abstract void calculateInterest();   // Must be implemented

    protected void approveLoan() {
        System.out.println("Loan Approved");
    }
}

