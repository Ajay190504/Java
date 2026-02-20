package keywords.thissuper;

public class Person {
    String name;
    int age;

    Person() {
        this("User", 0);   // calls parameterized constructor of same class
        System.out.println("Person Default Constructor");
    }

    Person(String name, int age) {
        this.name = name;     // differentiates instance variable from parameter
        this.age = age;
        System.out.println("Person Parameterized Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}