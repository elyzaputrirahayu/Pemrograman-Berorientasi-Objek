package PPBOpertemuan2;

public class laptop10 extends PC10 {
    private int statusBaterai; 
    private float berat;        

    public laptop10(String merk, String processor, int statusBaterai, float berat) {
        super(merk, processor); 
        this.statusBaterai = statusBaterai;
        this.berat = berat;
    }

    public void cekBaterai() {
        System.out.println("Sisa baterai laptop " + merk + ": " + statusBaterai + "%");
    }

    public void lipatLaptop() {
        System.out.println("Laptop " + merk + " dilipat (masuk mode sleep).");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi(); 
        System.out.println("Sisa Baterai : " + statusBaterai + "%");
        System.out.println("Berat Laptop : " + berat + " kg");
    }
}
