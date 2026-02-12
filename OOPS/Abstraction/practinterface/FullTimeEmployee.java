package abstraction.practinterface;

class FullTimeEmployee implements Employee {
    public double calculateSalary() { 
    	return 4000000; 
    	}

    public static void main(String[] args) {
        Employee e = new FullTimeEmployee();
        System.out.println(e.calculateSalary());
    }
}

