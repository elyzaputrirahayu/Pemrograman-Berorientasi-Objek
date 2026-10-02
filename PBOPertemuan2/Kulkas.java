package PBOPertemuan2;

public class Kulkas extends Barang10{
    private float ukuran;
    private float suhu;
    private int kapasitas;

    public Kulkas(String merk, String warna, float ukuran, int kapasitas) {
        super(merk, warna);
        this.ukuran = ukuran;
        this.kapasitas = kapasitas;
        this.suhu = 4.0f; // suhu default kulkas dalam Celcius
    }

    public float getUkuran() {
        return ukuran;
    }

    public float getSuhu() {
        return suhu;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void nyalakanKulkas() {
        System.out.println("Kulkas merk " + merk + " menyala");
    }

    public void matikanKulkas() {
        System.out.println("Kulkas merk " + merk + " dimatikan");
    }

    public void pengaturSuhu(float suhuBaru) {
        this.suhu = suhuBaru;
        System.out.println("Suhu kulkas diatur menjadi " + suhu + " derajat Celcius");
    }

    @Override
    public String toString() {
        return "Kulkas -> " + super.toString() + ", Ukuran: " + ukuran + ", Kapasitas: "
                + kapasitas + "L, Suhu: " + suhu + "C";
    }
}

