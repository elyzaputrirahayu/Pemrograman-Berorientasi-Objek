package PPBOPertemuan4.id.ac.polinema.relasiclass.TugasMandiri.Perpustakaan;

public class Anggota {
    private String nama;
    private String noAnggota;
    private KartuAnggota kartuAnggota; // relasi COMPOSITION

    public Anggota(String nama, String noAnggota, String tanggalDaftar) {
        this.nama = nama;
        this.noAnggota = noAnggota;
        // Anggota membuat sendiri KartuAnggota-nya, tidak menerima dari luar.
        // Inilah bukti kode relasi Composition: siklus hidup KartuAnggota
        // sepenuhnya bergantung pada objek Anggota yang membuatnya.
        this.kartuAnggota = new KartuAnggota("KTA-" + noAnggota, tanggalDaftar);
    }

    public String getNama() {
        return nama;
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public KartuAnggota getKartuAnggota() {
        return kartuAnggota;
    }

    public String info() {
        return "Anggota: " + nama + " (No: " + noAnggota + ") - " + kartuAnggota.info();
    }
}

