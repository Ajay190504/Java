package abstraction.practinterface;

class Circle implements Shape {
    double r = 5;

    public double area() { 
    	return Math.PI * r * r; 
    	}
    public double perimeter() { 
    	return 2 * Math.PI * r; 
    	}

    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}

