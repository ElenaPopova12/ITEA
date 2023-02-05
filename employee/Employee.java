package employee;

public class Employee {
    int id;
    private double salary;
    public String surname;

    public Employee(String surname) {
        this.surname = surname;
    }

    Employee(int id) {
        this.id = id;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    static void show() {
        System.out.println();
    }

    public void show1(String surname) {
        this.surname = surname;
    }

    public void show2(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        show();
    }
}

