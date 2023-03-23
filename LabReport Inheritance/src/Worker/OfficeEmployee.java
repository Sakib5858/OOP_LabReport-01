package Worker;

import Worker.Employee;

public class OfficeEmployee extends Employee {
    double salary,hour;

    public OfficeEmployee(String name, int id, int age, double salary,double hour) {
        super(name, id, age);
        this.salary = salary;
        this.hour = hour;
    }

    @Override
    public void showdetails() {
        super.showdetails();
        System.out.println("Working hour: " + hour);
        givesalary();
    }

    @Override
    void givesalary() {
        System.out.println("Salary: " + salary);
    }
}