package PPBOPertemuan3;

public class Kontainer {

    // Atribut private
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    // Konstruktor
    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    // Getter nomor resi
    public String getNomorResi() {
        return nomorResi;
    }

    // Getter nama pemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }

    // Getter kapasitas maksimal
    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    // Getter berat muatan saat ini
    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    // Method untuk menambah muatan
    public void tambahMuatan(double berat) {
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
            beratMuatanSaatIni += berat;
        } 
        else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
    }

    // Method untuk menurunkan muatan
    public void turunkanMuatan(double berat) {

    double batasMaksimal = beratMuatanSaatIni * 0.5;

    if (berat > batasMaksimal) {
        System.out.println(
            "Maaf, demi keselamatan, pembongkaran muatan satu kali jalan " +
            "tidak boleh melebihi 50% dari muatan saat ini!"
        );
    } 
    else if (berat <= beratMuatanSaatIni) {
        beratMuatanSaatIni -= berat;
    }
}
}

