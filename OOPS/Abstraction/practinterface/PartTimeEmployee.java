package abstraction.practinterface;

class PartTimeEmployee implements Employee {
    public double calculateSalary() { 
    	return 500 * 20; 
    	}

    public static void main(String[] args) {
        Employee e = new PartTimeEmployee();
        System.out.println(e.calculateSalary());
    }
}
