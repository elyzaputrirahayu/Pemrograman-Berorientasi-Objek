package PPBOPertemuan6;

public class TiketDomestik extends TiketPesawat{
    protected int pajakBandara;

    // Konstruktor tanpa parameter
    public TiketDomestik() {
        super();
    }

    // Konstruktor berparameter
    public TiketDomestik(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, int pajakBandara) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        super.tampilPesawat();
        System.out.println("Pajak Bandara    = " + pajakBandara);
        int totalBayar = hargaDasar + hitungBiayaBagasi() + pajakBandara;
        System.out.println("Total Bayar      = " + totalBayar);
    }
}
