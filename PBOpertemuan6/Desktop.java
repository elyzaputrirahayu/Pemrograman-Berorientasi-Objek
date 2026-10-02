package PBOpertemuan6;

public class Desktop extends Komputer {
    protected String Printer;

    public Desktop(String merk, int memory, int cpu, String printer) {
        super(merk, memory, cpu);
        Printer = printer;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Printer: " + Printer);
    }
}
