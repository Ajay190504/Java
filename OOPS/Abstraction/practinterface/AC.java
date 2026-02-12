package abstraction.practinterface;

class AC implements RemoteControl {
    public void powerOn() { 
    	System.out.println("AC ON"); 
    	}
    public void powerOff() { 
    	System.out.println("AC OFF"); 
    	}

    public static void main(String[] args) {
        RemoteControl r = new AC();
        r.powerOn();
        r.powerOff();
    }
}