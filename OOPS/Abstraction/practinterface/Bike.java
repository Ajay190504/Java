package abstraction.practinterface;

class Bike implements Vehicle {
    public void start() { 
    	System.out.println("Bike Started"); 
    	}
    public void stop() { 
    	System.out.println("Bike Stopped"); 
    	}

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
    }
}
