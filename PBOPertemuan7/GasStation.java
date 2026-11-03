package PBOPertemuan7;

public class GasStation {
    public void isiBahanBakar (MobilMewah mw, int jumlahbayar) {
        int jumlahliter = jumlahbayar / 10000;
        System.out.println("Mobil mewah telah dengan pertamax sejumlah " + jumlahliter + " liter" );
    }

    public void isiBahanBakar (MobilKuno mk, int jumlahbayar) {
        int jumlahliter = jumlahbayar / 10000;
        System.out.println("Mobil kuno diisi dengan Pertalite sejumlah " + jumlahliter + " liter");
    }
}
