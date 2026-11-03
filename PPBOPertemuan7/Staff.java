package PPBOPertemuan7;

public class Staff extends Karyawan{
    private int lembur;
    private double gajilembur;

    public void setLembur(int lembur)
    {
        this.lembur=lembur;
    }
    public int getLembur()
    {
        return lembur;
    }

    public void setGajiLembur(double gajilembur)
    {
        this.gajilembur = gajilembur;
    }
    public double getGajiLembur()
    {
        return gajilembur;
    }

    public double getGaji(int lembur, double gajiLembur)
    {
        return super.getGaji()+lembur*gajiLembur;
    }

    public double getGaji()
    {
        return super.getGaji()+lembur*gajilembur;
    }

    public void lihatInfo()
    {
        System.out.println("NIP\t\t :"+this.getNip());
        System.out.println("Nama\t\t :"+this.getNama());
        System.out.println("Golongan\t :"+this.getGolongan());
        System.out.println("Jml Lembur\t :"+this.getLembur());
        System.out.printf("Gaji Lembur\t :%.0f\n", this.getGajiLembur());
        System.out.printf("Gaji\t\t :%.0f\n", this.getGaji());
    }
}
