package abstraction.practinterface;

class Car implements Vehicle {
    public void start() { 
    	System.out.println("Car Started"); 
    	}
    public void stop() { 
    	System.out.println("Car Stopped"); 
    	}

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
