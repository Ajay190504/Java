package abstraction.practinterface;

class WhatsAppNotification implements Notification {
    public void sendMessage(String msg) { 
    	System.out.println("WhatsApp: " + msg); 
    	}

    public static void main(String[] args) {
        Notification n = new WhatsAppNotification();
        n.sendMessage("Order Shipped");
    }
}