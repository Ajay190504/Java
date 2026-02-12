package abstraction.practinterface;

class SMSNotification implements Notification {
    public void sendMessage(String msg) { 
    	System.out.println("SMS: " + msg);
    	}

    public static void main(String[] args) {
        Notification n = new SMSNotification();
        n.sendMessage("OTP");
    }
}

