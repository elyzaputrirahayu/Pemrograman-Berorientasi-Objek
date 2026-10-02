package PPBOPertemuan4.id.ac.polinema.relasiclass.TugasMandiri.Perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kota", 5);

        // Buku dibuat di LUAR Perpustakaan -> bukti relasi Aggregation
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", "B001");
        Buku buku2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", "B002");

        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);

        perpus.tampilkanDaftarBuku();

        // Anggota otomatis membuat KartuAnggota sendiri -> bukti relasi Composition
        Anggota budi = new Anggota("Budi Santoso", "A001", "01-01-2024");
        System.out.println();
        System.out.println(budi.info());

        // Printer dibuat sesaat, hanya dipakai untuk satu aksi -> bukti relasi Dependency
        Printer printer = new Printer("Epson L3110");
        System.out.println();
        perpus.cetakStrukPeminjaman(printer, budi, buku1);
    }
}
