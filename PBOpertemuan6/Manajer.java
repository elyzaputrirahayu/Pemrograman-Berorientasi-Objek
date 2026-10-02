package PBOpertemuan6;

public class Manajer extends Pegawai{
    public String departemen;

    @Override
    public void tampilkanStatus() {
        super.tampilkanStatus(); 
        System.out.println("Departemen: " + departemen);
    }
}
