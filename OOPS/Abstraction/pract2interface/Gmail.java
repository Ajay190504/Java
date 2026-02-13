package abstraction.pract2interface;

class Gmail implements Google {

    @Override
    public void login(String email, String password) {
        System.out.println("Gmail login successful for: " + email);
    }

    @Override
    public void signup(String email, String password) {
        System.out.println("Gmail account created for: " + email);
    }

    public void sendMail(String senderEmail, String subject, String message) {
        System.out.println("Mail Sent!");
        System.out.println("From: " + senderEmail);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }

    public void readInbox() {
        System.out.println("Inbox is Empty");
    }

    public static void main(String[] args) {
    	
        Gmail gmail = new Gmail();
       // Google gmail = new Gmail(); //Not allowing access to Gmail Methods
        
        gmail.signup("ajay@gmail.com", "1234");
        gmail.login("ajay@gmail.com", "1234");
        gmail.sendMail("ajay@gmail.com", "Meeting", "Let's meet at 5 PM.");
        gmail.readInbox();
    }
}
