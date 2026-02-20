
package keywords.access.defaultmod;

public class Runner3 {

    public static void main(String[] args) {

        // Accessible because both classes are in same package
        Student2 st = new Student2("Ajay", 34);

        // Direct access allowed
        System.out.println("Name: " + st.name);
        System.out.println("Roll No: " + st.rollNo);

        // Calling default method
        st.display();
    }
}