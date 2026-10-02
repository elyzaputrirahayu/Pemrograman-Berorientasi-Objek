package PPBOPertemuan4.id.ac.polinema.relasiclass.TugasMandiri.Perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private String kodeBuku;

    public Buku(String judul, String penulis, String kodeBuku) {
        this.judul = judul;
        this.penulis = penulis;
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String info() {
        return "[" + kodeBuku + "] " + judul + " - " + penulis;
    }
}

