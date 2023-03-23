package nclass;

import Worker.Employee;
import Worker.OfficeEmployee;
import Worker.Programmer;
import items.Cpu;

public class Main {
    public static void main(String[] args) {

        OfficeEmployee ob2 = new OfficeEmployee("Meherunnesa Shuvra",222,21,35000,9.5);
        ob2.showdetails();
        System.out.println("\n");

        Cpu ob1 = new Cpu("Afzal Sakib",221,21,30000,18,"Intel",8,256);
        ob1.assigncomputer();
        System.out.println("\n");
        ob1.alldetails();
    }
}