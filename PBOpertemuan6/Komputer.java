package PBOpertemuan6;

public class Komputer {
    protected String Merk;
    protected int KapasitasMemory;
    protected int KecepatanCPU;

    public Komputer (String merk, int memory, int cpu) {
        Merk = merk;
        KapasitasMemory = memory;
        KecepatanCPU = cpu;
    }

    public void showInfo() {
        System.out.println("\nMerk: " + Merk);
        System.out.println("Kapasitas Memory: " + KapasitasMemory);
        System.out.println("Kecepatan CPU: " + KecepatanCPU);
    }

    public void nyalakanKomputer () {
        System.out.println("\nKomputer " + Merk + " dinyalakan! ");
    }
}
