package abstraction.pract2interface;

class YouTube implements Google {

    @Override
    public void login(String email, String password) {
        System.out.println("YouTube login successful for: " + email);
    }

    @Override
    public void signup(String email, String password) {
        System.out.println("YouTube account created for: " + email);
    }

    public void playVideo(String topic) {
        System.out.println("Playing video on: " + topic);
    }

    public void stopVideo() {
        System.out.println("Video stopped.");
    }

    public static void main(String[] args) {
        
    	YouTube yt = new YouTube();
        // Google yt = new YouTube(); //Not allowing access to YouTube Methods
        
        yt.signup("ajay@gmail.com", "1234");
        yt.login("ajay@gmail.com", "1234");
        yt.playVideo("Java Interfaces");
        yt.stopVideo();
    }
}

