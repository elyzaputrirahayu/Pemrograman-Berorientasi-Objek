package PBOPertemuan9;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji); // Memanggil constructor Pegawai
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}
