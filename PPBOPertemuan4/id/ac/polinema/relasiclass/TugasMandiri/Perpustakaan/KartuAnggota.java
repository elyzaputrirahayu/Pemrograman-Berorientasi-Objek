package PPBOPertemuan4.id.ac.polinema.relasiclass.TugasMandiri.Perpustakaan;

public class KartuAnggota {
    private String nomorKartu;
    private String tanggalTerbit;

    public KartuAnggota(String nomorKartu, String tanggalTerbit) {
        this.nomorKartu = nomorKartu;
        this.tanggalTerbit = tanggalTerbit;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public String info() {
        return "Kartu No: " + nomorKartu + " (terbit " + tanggalTerbit + ")";
    }
}

