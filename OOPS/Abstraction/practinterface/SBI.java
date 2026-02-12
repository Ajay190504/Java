package abstraction.practinterface;

class SBI implements Bank {
    double balance = 5000;

    public void deposit(double amount) { 
    	balance += amount; 
    	System.out.println("Amount: "+amount+" credited to your account and Balance: "+balance); 
    	}
    public void withdraw(double amount) { 
    	balance -= amount; 
    	System.out.println("Amount: "+amount+" debited from your account and Balance: "+balance); 
    }
    public void checkBalance() { 
    	System.out.println(balance); 
    	}

    public static void main(String[] args) {
        Bank b = new SBI();
        b.deposit(200);
        b.withdraw(2000);
        b.checkBalance();
    }
}
