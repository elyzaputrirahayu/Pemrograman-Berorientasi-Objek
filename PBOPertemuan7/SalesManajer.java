package PBOPertemuan7;

public class SalesManajer extends Manajer {
    protected String departemen;

    public SalesManajer(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    // Overriding cetakStatus(): sengaja TIDAK memanggil super.cetakStatus(),
    // karena urutan tampilan yang diminta adalah Nama -> Departemen -> Gaji.
    // Kalau pakai super.cetakStatus() dulu, Gaji akan tercetak sebelum
    // Departemen (urutannya jadi salah).
    @Override
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
}