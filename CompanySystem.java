package Lab06;

class Employee {
    double salary = 50000;
    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

class PermanentEmployee extends Employee {
    void calculateBonus() {
        double bonus = salary * 0.10;
        int bonusInt = (int) bonus;   // type casting
        System.out.println("Bonus: " + bonusInt);
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();

        p.displaySalary();
        p.calculateBonus();
    }
}
