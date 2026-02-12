package abstraction.practinterface;

class Rectangle implements Shape {
    double l = 10, w = 4;

    public double area() { 
    	return l * w; 
    	}
    public double perimeter() { 
    	return 2 * (l + w); 
    	}

    public static void main(String[] args) {
        Shape s = new Rectangle();
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
