package keywords.access.pubprot;

//Importing class from another package
import keywords.access.publicmod.Student4;

public class PubAccess {

 public static void main(String[] args) {

	 // Allowed object creation of class in different package also
     Student4 s = new Student4("Ajay", 34);

     // Allowed Public variables (direct access)
     System.out.println("Name: " + s.name);
     System.out.println("Roll No: " + s.rollNo);

     // Allowed Public method call
     s.display();

 }
}
