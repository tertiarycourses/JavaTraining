package com.tertiaryinfotech;

public class Employee {

    String name; // property/atttributes/data of the class
    double salary;

    Employee (String name, double salary) {
        this.name = name;   //pass the name to the object
        this.salary = salary; //pass the salary to the object
    }
    public void displayEmpDetails() {
        System.out.printf("%s salary is %.2f\n",this.name, this.salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ally",5000);
        Employee emp2 = new Employee("Belinda", 4000);

        emp1.displayEmpDetails();
        emp2.displayEmpDetails();
    }
}
