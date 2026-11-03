package PPBOPertemuan9;

public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public int getKaki() {
        return jmlKaki;
    }

    // Menampilkan data umum semua binatang (nama & jumlah kaki).
    // Class turunan meng-override method ini untuk menambah datanya sendiri.
    public void displayBinatang() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Kaki: " + jmlKaki);
    }
}
