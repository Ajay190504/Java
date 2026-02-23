package keywords.finalkeyword;

final class AadhaarSystem {   // final class - cannot sub classed

    final String COUNTRY = "India";   // final variable - can not be modified

    String citizenName;
    int age;

    AadhaarSystem(String name, int age) {
        this.citizenName = name;
        this.age = age;
    }

    final void verifyCitizen() {   // final method - cannot be overridden
        if (age >= 18) {
            System.out.println(citizenName + " is eligible.");
        } else {
            System.out.println(citizenName + " is not eligible.");
        }

        System.out.println("Country: " + COUNTRY);
    }

    public static void main(String[] args) {
        AadhaarSystem a1 = new AadhaarSystem("Ajay", 22);
        a1.verifyCitizen();
    }
}