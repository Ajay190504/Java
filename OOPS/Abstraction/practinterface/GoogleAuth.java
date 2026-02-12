package abstraction.practinterface;

class GoogleAuth implements Authentication {
    public void login() { 
    	System.out.println("Google Login"); 
    	}
    public void logout() { 
    	System.out.println("Google Logout"); 
    	}

    public static void main(String[] args) {
        Authentication a = new GoogleAuth();
        a.login();
        a.logout();
    }
}
