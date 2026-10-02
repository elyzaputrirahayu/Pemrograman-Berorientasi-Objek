package PBOPertemuan2;

public class Barang10 {
    protected String merk;
    protected String warna;

    public Barang10(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public String toString() {
        return "Merk: " + merk + ", Warna: " + warna;
    }
}

