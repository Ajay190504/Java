package keywords.access.pubprot;

import keywords.access.protectedmod.Student3; //Import class from different package - required for access

public class ProtAcceess extends Student3 {

    public ProtAcceess(String name, int rollNo) {
        super(name, rollNo); //calling Protected parameterized constructor of parent class of different package
    }

    public static void main(String[] args) {

        ProtAcceess p = new ProtAcceess("Ajay", 34);

        // Protected members access Allowed in subclass in different package
        System.out.println("Name: " + p.name);
        System.out.println("Roll No: " + p.rollNo);

        p.display();
    }
}