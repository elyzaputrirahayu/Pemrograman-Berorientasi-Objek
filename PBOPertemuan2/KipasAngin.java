package PBOPertemuan2;

public class KipasAngin extends Barang10 {
    private float ukuran;
    private int kecepatan;

    public KipasAngin(String merk, String warna, float ukuran) {
        super(merk, warna);
        this.ukuran = ukuran;
        this.kecepatan = 0;
    }

    public float getUkuran() {
        return ukuran;
    }

    public void setUkuran(float ukuran) {
        this.ukuran = ukuran;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void nyalakanKipas() {
        kecepatan = 1;
        System.out.println("Kipas angin merk " + merk + " menyala dengan kecepatan " + kecepatan);
    }

    public void matikanKipas() {
        kecepatan = 0;
        System.out.println("Kipas angin merk " + merk + " dimatikan");
    }

    public void tambahKecepatan() {
        kecepatan++;
        System.out.println("Kecepatan kipas bertambah menjadi " + kecepatan);
    }

    public void kurangiKecepatan() {
        if (kecepatan > 0) {
            kecepatan--;
        }
        System.out.println("Kecepatan kipas berkurang menjadi " + kecepatan);
    }

    @Override
    public String toString() {
        return "Kipas Angin -> " + super.toString() + ", Ukuran: " + ukuran + ", Kecepatan: " + kecepatan;
    }
}