package keywords.access.publicmod;

public class Main {

    public static void main(String[] args) {

        // Allowed object creation of class in Same package 
        Student4 s = new Student4("Ajay", 34);

        // Allowed Public variables (direct access)
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);

        // Allowed Public method call
        s.display();

    }
}