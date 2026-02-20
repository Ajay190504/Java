package keywords.access.protectedmod;

// Protected can be accessed in same package without import and outside package using inheritance only
// Accessing outside package : package keywords.access.pubprot; --> ProtAccess class

public class Student3 {
	//Protected variables
    protected String name;
    protected int rollNo;

    //Protected constructor
    protected Student3(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    //Protected method
    protected void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}