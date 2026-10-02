package PPBOPertemuan6;

public class Manager extends Karyawan{

    public int tunjangan;

    public Manager() {

    }

    public void tampilkanDataManager() {
        super.tampilkanDataKaryawan();
        System.out.println("Tunjangan\t = " +tunjangan);
        System.out.println("Total Gaji\t = " +(super.gaji+tunjangan));
    }
}
