package abstraction.practinterface;

class DebitCard implements Payment {
    public void pay(double amount) { 
    	System.out.println("Paid with DebitCard: " + amount); 
    	}

    public static void main(String[] args) {
        Payment p = new DebitCard();
        p.pay(1500);
    }
}