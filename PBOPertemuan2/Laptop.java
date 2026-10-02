package PBOPertemuan2;

public class Laptop extends Barang10 {
   
    private int kapasitasPenyimpanan;
    private int kapasitasRAM;
    private float ukuranLayar;
    private int persentaseBaterai;

    public Laptop(String merk, String warna, int kapasitasPenyimpanan, int kapasitasRAM, float ukuranLayar) {
        super(merk, warna);
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
        this.kapasitasRAM = kapasitasRAM;
        this.ukuranLayar = ukuranLayar;
        this.persentaseBaterai = 100;
    }

    public int getKapasitasPenyimpanan() {
        return kapasitasPenyimpanan;
    }

    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public float getUkuranLayar() {
        return ukuranLayar;
    }

    public void nyalakanLaptop() {
        System.out.println("Laptop merk " + merk + " menyala");
    }

    public void matikanLaptop() {
        System.out.println("Laptop merk " + merk + " dimatikan");
    }

    public void isiBaterai() {
        persentaseBaterai = 100;
        System.out.println("Baterai laptop terisi penuh: " + persentaseBaterai + "%");
    }

    public void memutarVideo() {
        System.out.println("Laptop merk " + merk + " sedang memutar video");
    }

    @Override
    public String toString() {
        return "Laptop -> " + super.toString() + ", RAM: " + kapasitasRAM + "GB, Penyimpanan: "
                + kapasitasPenyimpanan + "GB, Layar: " + ukuranLayar + " inci";
    }
}

