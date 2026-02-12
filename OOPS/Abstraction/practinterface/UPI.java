package abstraction.practinterface;

class UPI implements Payment {
    public void pay(double amount) { 
    	System.out.println("Paid with UPI: " + amount); 
    	}

    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(1000);
    }
}
