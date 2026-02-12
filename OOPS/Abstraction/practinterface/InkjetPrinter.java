package abstraction.practinterface;

class InkjetPrinter implements Printer {
    public void print(String text) {
    	System.out.println("Inkjet: " + text); 
    	}

    public static void main(String[] args) {
        Printer p = new InkjetPrinter();
        p.print("Hello");
    }
}