package PPBOPertemuan4.id.ac.polinema.relasiclass.TugasMandiri.Perpustakaan;

public class Perpustakaan {
    private String nama;
    private Buku[] daftarBuku; // relasi AGGREGATION
    private int jumlahBukuTersimpan;

    public Perpustakaan(String nama, int kapasitas) {
        this.nama = nama;
        this.daftarBuku = new Buku[kapasitas];
        this.jumlahBukuTersimpan = 0;
    }

    // AGGREGATION: Perpustakaan TIDAK memanggil new Buku() sendiri.
    // Objek Buku dibuat di luar (oleh caller/pemanggil), lalu hanya
    // "dititipkan" ke sini melalui parameter method. Buku tetap bisa
    // berdiri sendiri lepas dari Perpustakaan (mis. sebelum dibeli/
    // didaftarkan ke perpustakaan mana pun).
    public void tambahBuku(Buku buku) {
        if (jumlahBukuTersimpan >= daftarBuku.length) {
            System.out.println("Rak buku penuh, tidak bisa menambah buku lagi.");
            return;
        }
        daftarBuku[jumlahBukuTersimpan] = buku;
        jumlahBukuTersimpan++;
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar buku di " + nama + ":");
        for (int i = 0; i < jumlahBukuTersimpan; i++) {
            System.out.println("- " + daftarBuku[i].info());
        }
    }

    // DEPENDENCY: Printer hanya dipakai sesaat sebagai parameter method,
    // tidak pernah disimpan sebagai atribut Perpustakaan. Begitu method
    // ini selesai, hubungan dengan objek printer tersebut langsung usai.
    public void cetakStrukPeminjaman(Printer printer, Anggota anggota, Buku buku) {
        String isiStruk = "STRUK PEMINJAMAN - " + nama + "\n"
                + anggota.info() + "\n"
                + "Meminjam buku: " + buku.info();
        printer.cetak(isiStruk);
    }
}

