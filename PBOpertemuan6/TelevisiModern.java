package PBOpertemuan6;

public class TelevisiModern extends Televisi {
    private String displayMode;
    private String dvd;

    public TelevisiModern(String merek, int jumlahChannel) {
        super(); // memanggil konstruktor Televisi() di baris pertama
        this.merek = merek;                 // atribut public warisan dari Televisi
        this.jumlahChannel = jumlahChannel; // atribut public warisan dari Televisi
        this.displayMode = "TV";
        this.dvd = "kosong";
    }

    // Di class diagram bernama changeDisplayMode(mode)
    public void gantiModusTampilan(String mode) {
        this.displayMode = mode;
    }

    // Di class diagram bernama insertDVD(dvdTitle)
    public void masukkanDVD(String judulDVD) {
        this.dvd = judulDVD;
    }

    // Di class diagram bernama playDVD()
    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }
}

