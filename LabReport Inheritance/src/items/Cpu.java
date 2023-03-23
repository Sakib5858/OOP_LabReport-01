package items;

public class Cpu extends Computer{

    int ram,rom;

    public Cpu(String name, int id, int age, double projectcoast, int deadline, String processor_name, int ram, int rom) {
        super(name, id, age, projectcoast, deadline, processor_name);
        this.ram = ram;
        this.rom = rom;
    }
    @Override
    public void assigncomputer() {
        super.assigncomputer();
        System.out.println("Ram: " + ram + "gb\nRom: " + rom + " GB DDR5");
    }

    @Override
    public void alldetails() {
        super.alldetails();
        assigncomputer();
    }
}
