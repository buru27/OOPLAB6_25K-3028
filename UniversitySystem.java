package Lab06;

class Person {
    void displayPerson() {
        System.out.println("This is a person.");
    }
}

class Student extends Person {
    void displayStudent() {
        System.out.println("This is a student.");
    }
}

class GraduateStudent extends Student {
    void research() {
        System.out.println("Graduate student is doing research.");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GraduateStudent g = new GraduateStudent();

        g.displayPerson();
        g.displayStudent();
        g.research();
    }
}
