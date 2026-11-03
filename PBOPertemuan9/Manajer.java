package PBOPertemuan9;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji); // Memanggil constructor Pegawai
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }
}
