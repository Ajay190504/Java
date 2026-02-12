package abstraction.practinterface;

class CreditCard implements Payment {
    public void pay(double amount) { 
    	System.out.println("Paid with CreditCard: " + amount); 
    	}

    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay(2000);
    }
}
