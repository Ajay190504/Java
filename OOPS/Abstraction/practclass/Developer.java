package abstraction.practclass;

class Developer extends Employee {

    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateBonus() {
        return baseSalary * 0.10;
    }

    public static void main(String[] args) {

        Employee.companyPolicy();   // static method call

        Employee emp = new Developer("Ajay", 50000);
        System.out.println("Total Salary: " + emp.totalSalary());
    }
}
