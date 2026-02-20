package keywords.thissuper;

public class Car extends Vehicle {
    int speed = 120;   // hides parent variable

    void showSpeed() {
        System.out.println("Car Speed: " + speed);          // current class variable
        System.out.println("Vehicle Speed: " + super.speed); // parent class variable
    }

    void display() {
        this.showSpeed();  // calls same class method
        super.showSpeed(); // calls parent class method
    }
}
