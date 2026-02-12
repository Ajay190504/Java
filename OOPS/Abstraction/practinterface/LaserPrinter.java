package abstraction.practinterface;


class LaserPrinter implements Printer {
    public void print(String text) { 
    	System.out.println("Laser: " + text); 
    	}

    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print("Hello");
    }
}
