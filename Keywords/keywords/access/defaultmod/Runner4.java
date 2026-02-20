package keywords.access.defaultmod;

public class Runner4 extends Student2 {

    Runner4(String name, int rollNo) {
        super(name, rollNo); //Calling super class constructor
        System.out.println("calling super class constructor");
    }

    public static void main(String[] args) {

        Runner4 r = new Runner4("Ajay", 34);

        // Direct access allowed (same package)
        System.out.println("Name: " + r.name);
        System.out.println("Roll No: " + r.rollNo);

     // Calling default method
        r.display();
    }
}