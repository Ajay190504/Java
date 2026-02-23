package keywords.statickeyword;

class University {

    // Static Variable
    static String universityName;

    // Static Block
    static {
        universityName = "Savitribai Phule University";
        System.out.println("University system loaded...");
    }

    // Static Method
    static void showUniversityName() {
        System.out.println("University: " + universityName);
    }

    // Static Nested Class
    static class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void display() {
            System.out.println("Department: " + deptName);
            // Accessing static variable of outer class
            System.out.println("Belongs to: " + universityName);
        }
    }

    public static void main(String[] args) {

        // calling static method
        University.showUniversityName();

        // creating object of static nested class
        University.Department d1 = new University.Department("Computer Science");
        d1.display();
    }
}
