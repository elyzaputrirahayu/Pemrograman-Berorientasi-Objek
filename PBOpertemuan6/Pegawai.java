package PBOpertemuan6;

public class Pegawai {
    public String nama;
    public double gaji;

    public String getDescription() {
        return "Nama: " + nama + ", gaji: " + gaji;
    }

    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
