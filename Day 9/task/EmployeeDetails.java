interface Bonus {
    double calculateBonus();
}

abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void displayDetails();
}

class FullTimeEmployee extends Employee implements Bonus {

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double calculateBonus() {
        return salary * 0.2;
    }

    void displayDetails() {
        System.out.println("Full Time Employee");
        System.out.println(name + " " + id + " " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}

class PartTimeEmployee extends Employee implements Bonus {

    PartTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    void displayDetails() {
        System.out.println("Part Time Employee");
        System.out.println(name + " " + id + " " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Steve", 101, 50000);
        Employee e2 = new PartTimeEmployee("John", 102, 20000);

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}