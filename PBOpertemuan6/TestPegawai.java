package PBOpertemuan6;

public class TestPegawai {
    public static void main(String[] args) {
        Manajer man = new Manajer();

        man.nama = "Bob";
        man.gaji = 9999999;
        man.departemen = "IT";

        System.out.println("Nama: " + man.nama);
        System.out.println("Gaji: " + man.gaji);
        System.out.println("Departemen: " + man.nama);

        System.out.println("\n--- tampilkanStatus() milik Pegawai ---");
        Pegawai peg = new Pegawai();
        peg.nama = "Alice";
        peg.gaji = 5000000;
        peg.tampilkanStatus();
 
        System.out.println("\n--- tampilkanStatus() milik Manajer (overriding) ---");
        man.tampilkanStatus();
 
        System.out.println("\n--- Supervisor ---");
        Supervisor sup = new Supervisor();
        sup.nama = "Charlie";
        sup.gaji = 7500000;
        sup.departemen = "Produksi";
        sup.shift = "pagi";
        sup.durasi = 2;
 
        sup.tampilkanStatus();     
        System.out.println("Shift: " + sup.shift);
        System.out.println("Durasi: " + sup.durasi);
        sup.tampilkanGajiTotal();
    }
}
