package PBOpertemuan6;

public class Laptop extends Komputer {
    protected  int ResolusiLayar;

    public Laptop (String merk, int memory, int cpu, int layar) {
        super(merk, memory, cpu);
        ResolusiLayar = layar;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Resolusi Layar: " + ResolusiLayar);
    }
}
