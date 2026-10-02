package PPBOPertemuan4.id.ac.polinema.relasiclass.TugasMandiri.Perpustakaan;

public class Printer {
    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String isi) {
        System.out.println("=== [" + merk + "] Mencetak ===");
        System.out.println(isi);
        System.out.println("=== Selesai ===");
    }
}

