package keywords.access.publicmod;

//Public class accessible from any package
public class Student4 {

 // Public variables accessible everywhere
 public String name;
 public int rollNo;

 // Public constructor  object can be created from any package
 public Student4(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }

 // Public method callable from any package
 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Roll No: " + rollNo);
 }
}
