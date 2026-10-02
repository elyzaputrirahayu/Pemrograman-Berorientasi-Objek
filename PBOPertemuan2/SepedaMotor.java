package PBOPertemuan2;

public class SepedaMotor extends Barang10{

    private String jenisMotor;
    private float jumlahBahanMotor; 
    private int tahunProduksi;
    private int kecepatan;

    public SepedaMotor(String merk, String warna, String jenisMotor, float jumlahBahanMotor, int tahunProduksi) {
        super(merk, warna);
        this.jenisMotor = jenisMotor;
        this.jumlahBahanMotor = jumlahBahanMotor;
        this.tahunProduksi = tahunProduksi;
        this.kecepatan = 0;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public float getJumlahBahanMotor() {
        return jumlahBahanMotor;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin motor merk " + merk + " menyala");
    }

    public void matikanMesin() {
        kecepatan = 0;
        System.out.println("Mesin motor merk " + merk + " dimatikan");
    }

    public void mengerem() {
        kecepatan = 0;
        System.out.println("Motor mengerem, kecepatan sekarang " + kecepatan);
    }

    public void tambahKecepatan() {
        kecepatan += 10;
        System.out.println("Kecepatan motor bertambah menjadi " + kecepatan + " km/jam");
    }

    @Override
    public String toString() {
        return "Sepeda Motor -> " + super.toString() + ", Jenis: " + jenisMotor
                + ", Tahun Produksi: " + tahunProduksi;
    }
}

