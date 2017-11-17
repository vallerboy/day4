package oop.task4;

public class Company {
    public static void main(String[] args) {
        Employee employee =
                new Employee("Oskar", "Polak", "12", "5");
        Employee employee1 =
                new Employee("Oskar", "Polak", "12", "5");
        Employee employee2 =
                new Employee("Oskar", "Polak", "12", "5");

        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
