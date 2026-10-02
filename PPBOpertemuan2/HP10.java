package PPBOpertemuan2; 

public class HP10 extends PC10 {
    private String tipeKartuSIM; 
    private int jumlahKamera;

    public HP10(String merk, String processor, String tipeKartuSIM, int jumlahKamera) {
        super (merk, processor);
        this.tipeKartuSIM = tipeKartuSIM;
        this.jumlahKamera = jumlahKamera;
    }

    public void telepon(String nomorTujuan) {
        System.out.println("HP " + merk + " menelepon ke " + nomorTujuan + " menggunakan SIM " + tipeKartuSIM + ".");
    }

    public void foto() {
        System.out.println("HP " + merk + " mengambil foto dengan " + jumlahKamera + " kamera.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- INFORMASI HP ---");
        super.cetakInformasi(); 
        System.out.println("Provider SIM   : " + tipeKartuSIM);
        System.out.println("Jumlah Kamera  : " + jumlahKamera);
    }
}
