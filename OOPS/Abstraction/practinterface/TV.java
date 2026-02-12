package abstraction.practinterface;

class TV implements RemoteControl {
    public void powerOn() { 
    	System.out.println("TV ON"); 
    	}
    public void powerOff() { 
    	System.out.println("TV OFF"); 
    	}

    public static void main(String[] args) {
        RemoteControl r = new TV();
        r.powerOn();
        r.powerOff();
    }
}
