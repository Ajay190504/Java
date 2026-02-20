package keywords.access.privatemod;

// Private --> accessible within same class only 
// Can be accessed using getters and setters and factory method

public class Student {

    // Private variables (accessible only inside this class)
    private String name;
    private int rollNo;

    // Private constructor (object cannot be created outside this class)
    private Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Public factory method to create object in other class
    public static Student createStudent(String name, int rollNo) {
        return new Student(name, rollNo);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {

    	//Accessing Private members using object
        Student st1 = new Student("Ajay", 34);

        System.out.println("Name: " + st1.name);
        System.out.println("Roll No: " + st1.rollNo);
    }
}