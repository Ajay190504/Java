package abstraction.practinterface;

class HDFC implements Bank {
    double balance = 8000;

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
        Bank b = new HDFC();
        b.deposit(2000);
        b.withdraw(400);
        b.checkBalance();
    }
}
