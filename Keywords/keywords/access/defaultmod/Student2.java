package keywords.access.defaultmod;

// No access specifier keyword - default access specifier
// Default --> accessible within package only

class Student2 {

    // Default access variables (no modifier)
    String name;
    int rollNo;

    // Default access constructor
    Student2(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}