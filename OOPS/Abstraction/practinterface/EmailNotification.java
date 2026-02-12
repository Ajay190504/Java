package abstraction.practinterface;

class EmailNotification implements Notification {
    public void sendMessage(String msg) { 
    	System.out.println("Email: " + msg); 
    	}

    public static void main(String[] args) {
        Notification n = new EmailNotification();
        n.sendMessage("Welcome");
    }
}

