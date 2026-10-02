package PBOpertemuan6;

public class Supervisor extends Manajer {
    public String shift; 
    public int durasi;  

    public void tampilkanGajiTotal() {
        System.out.printf("Gaji total: %,.2f%n", gaji * durasi);
    }
}

