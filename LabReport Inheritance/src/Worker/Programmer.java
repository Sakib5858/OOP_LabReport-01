package Worker;

import Worker.Employee;
import items.Cpu;

public class Programmer extends Employee {

    double projectcoast;
    int deadline;

    public Programmer(String name, int id, int age, double projectcoast, int deadline) {
        super(name, id, age);
        this.projectcoast = projectcoast;
        this.deadline = deadline;
    }

    @Override
    protected void showdetails() {
        super.showdetails();
        System.out.println("projectcoast: " + projectcoast + "\nProject deadline: " + deadline);
        givesalary();
    }

    @Override
    void givesalary() {
        System.out.println("Per month salary: " +(projectcoast/deadline)*30 );
    }


}
