package abstraction.pract2interface;

public class DynamicDispatch implements Google {
	 @Override
	    public void login(String email, String password) {
	        System.out.println("Test login successful for: " + email);
	    }

	    @Override
	    public void signup(String email, String password) {
	        System.out.println("Test account created for: " + email);
	    }
	    
	    public static void main(String[] args) {
			
	    	// Dyanamic Dispatch : Reference Creation Of Interface
	    	Google gt1 = new DynamicDispatch();
			
			gt1.signup("ajay@gmail.com", "1234");
	        gt1.login("ajay@gmail.com", "1234");
		}
}
