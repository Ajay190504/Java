package keywords.access.privatemod;

public class Runner2 {

    public static void main(String[] args) {

        // Cannot use: new Student("Ajay", 34);
        // Because constructor is private
    	
    	//using factory method to create object
        Student st = Student.createStudent("Rohit", 45);  

        // Using getters
        System.out.println("Name: " + st.getName());
        System.out.println("Roll No: " + st.getRollNo());

        // Using setters
        st.setName("Virat");
        st.setRollNo(18);

        System.out.println("Updated Name: " + st.getName());
        System.out.println("Updated Roll No: " + st.getRollNo());
    }
}