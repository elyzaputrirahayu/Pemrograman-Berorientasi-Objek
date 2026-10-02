package PPBOPertemuan4.id.ac.polinema.relasiclass.percobaan6;

public class Printer {
    private  String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String namaFile) {
        System.out.println("[" + merk + "] mencetak " + namaFile + "..." );
        System.out.println("[" + merk + "] selesai.");
    }
}
