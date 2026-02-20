package keywords.access.protectedmod;

public class Runner5 {

    public static void main(String[] args) {

        // Same package allowed
        Student3 s = new Student3("Ajay", 34);

        // Direct access of Protected members allowed within same package
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
        
        //Calling Protected method
        s.display();
    }
}