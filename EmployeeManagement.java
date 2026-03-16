package Lab06;

class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing the team.");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.work();        // inherited method
        m.manageTeam();  // manager method
    }
}