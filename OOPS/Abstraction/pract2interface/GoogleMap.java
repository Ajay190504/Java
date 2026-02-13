package abstraction.pract2interface;

class GoogleMap implements Google {

    @Override
    public void login(String email, String password) {
        System.out.println("Google Map login successful for: " + email);
    }

    @Override
    public void signup(String email, String password) {
        System.out.println("Google Map account created for: " + email);
    }

    public void searchLocation(String location) {
        System.out.println("Searching location: " + location);
    }

    public void getDirections(String source, String destination) {
        System.out.println("Directions from " + source + " to " + destination);
    }

    public static void main(String[] args) {
    	
        GoogleMap map = new GoogleMap();
        //Google map = new GoogleMap(); //Not allowing access to GoogleMap Methods
        
        map.signup("ajay@gmail.com", "1234");
        map.login("ajay@gmail.com", "1234");
        map.searchLocation("Mumbai");
        map.getDirections("Barshi", "Pune");
    }
}

