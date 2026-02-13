package abstraction.pract2interface;

class GoogleChrome implements Google {

    @Override
    public void login(String email, String password) {
        System.out.println("Chrome login successful for: " + email);
    }

    @Override
    public void signup(String email, String password) {
        System.out.println("Chrome account created for: " + email);
    }

    public void browse(String website) {
        System.out.println("Browsing website: " + website);
    }

    public void download(String fileName) {
        System.out.println("Downloading file: " + fileName);
    }

    public static void main(String[] args) {
    	
        GoogleChrome chrome = new GoogleChrome();
        //Google chrome = new GoogleChrome(); //Not allowing access to GoogleChrome Methods
        
        chrome.signup("ajay@gmail.com", "1234");
        chrome.login("ajay@gmail.com", "1234");
        chrome.browse("www.google.com");
        chrome.download("file.pdf");
    }
}
