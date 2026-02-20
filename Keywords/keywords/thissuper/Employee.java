package keywords.thissuper;

public class Employee extends Person {
    int salary;

    Employee() {
        super();   // calls Person() (non-parameterized parent constructor) 
        System.out.println("Employee Default Constructor");
    }

    Employee(String name, int age, int salary) {
        super(name, age);   // calls Person(String, int) (parameterized parent constructor) 
        this.salary = salary;
        System.out.println("Employee Parameterized Constructor");
    }
    
    void sayHello() {
    	System.out.println("Hello method");
    }

    void display() {
        super.display();   // call parent method
        this.sayHello();  //call method of same class
        System.out.println("Salary: " + salary);
    }
}