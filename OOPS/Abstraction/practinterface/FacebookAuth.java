package abstraction.practinterface;

class FacebookAuth implements Authentication {
    public void login() { 
    	System.out.println("Facebook Login"); 
    	}
    public void logout() { 
    	System.out.println("Facebook Logout"); 
    	}

    public static void main(String[] args) {
        Authentication a = new FacebookAuth();
        a.login();
        a.logout();
    }
}
