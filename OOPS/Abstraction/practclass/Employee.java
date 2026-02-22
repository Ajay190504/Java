package abstraction.practclass;

abstract class Employee {

    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateBonus();

    double totalSalary() {
        return baseSalary + calculateBonus();
    }

    static void companyPolicy() {
        System.out.println("Office timing: 9 AM - 6 PM");
    }
}
