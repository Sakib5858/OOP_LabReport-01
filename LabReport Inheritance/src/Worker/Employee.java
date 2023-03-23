package Worker;

public abstract class Employee {

    protected String name;
    protected int id,age;

    protected Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    abstract void givesalary();

    protected void showdetails() {
        System.out.println("\nDetails :\n--------------");
        System.out.println("Name: " + name + "\nID: " + id + "\nAge: " + age);

    }
}
