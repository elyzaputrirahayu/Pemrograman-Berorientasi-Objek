package PBOPertemuan2;

public class HP extends Barang10{
    private int kapasitasPenyimpanan;
    private int persentaseBaterai;
    private int volume;

    public HP(String merk, String warna, int kapasitasPenyimpanan) {
        super(merk, warna);
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
        this.persentaseBaterai = 100;
        this.volume = 5;
    }

    public int getKapasitasPenyimpanan() {
        return kapasitasPenyimpanan;
    }

    public int getPersentaseBaterai() {
        return persentaseBaterai;
    }

    public void nyalakanHP() {
        System.out.println("HP merk " + merk + " menyala");
    }

    public void matikanHP() {
        System.out.println("HP merk " + merk + " dimatikan");
    }

    public void isiBaterai() {
        persentaseBaterai = 100;
        System.out.println("Baterai HP terisi penuh: " + persentaseBaterai + "%");
    }

    public void tambahVolume() {
        volume++;
        System.out.println("Volume HP bertambah menjadi " + volume);
    }

    public void kurangiVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Volume HP berkurang menjadi " + volume);
    }

    @Override
    public String toString() {
        return "HP -> " + super.toString() + ", Kapasitas Penyimpanan: " + kapasitasPenyimpanan
                + "GB, Baterai: " + persentaseBaterai + "%";
    }
}

