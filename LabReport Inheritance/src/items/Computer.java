package items;

import Worker.Programmer;

public class Computer extends Programmer{
    String processor_name;

    public Computer(String name, int id, int age, double projectcoast, int deadline, String processor_name) {
        super(name, id, age, projectcoast, deadline);
        this.processor_name = processor_name;
    }

    protected void assigncomputer() {
        System.out.println("Assign Computer for programmer --> " + name);
        System.out.println("Processor name: " + processor_name);
    }
    protected void alldetails(){
        super.showdetails();
    }
}