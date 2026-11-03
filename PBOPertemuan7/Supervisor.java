package PBOPertemuan7;

public class Supervisor extends Manajer {
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    // Overriding: naikkanGaji() di sini menimpa versi milik Manajer
    public void naikkanGaji() {
        gaji += 1500000;
    }
}