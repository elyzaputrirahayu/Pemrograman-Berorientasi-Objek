package PPBOpertemuan2;

public class magiccom10 {
    private String merk;
    private int kapasitas; 

    public magiccom10(String merk, int kapasitas) {
        this.merk = merk;
        this.kapasitas = kapasitas;
    }

    public void memasakNasi() {
        System.out.println("Magic Com " + merk + " sedang memasak nasi...");
    }

    public void menghangatkanNasi() {
        System.out.println("Magic Com " + merk + " beralih ke mode menghangatkan nasi.");
    }

    public void cetakInformasi() {
        System.out.println("--- INFORMASI MAGIC COM ---");
        System.out.println("Merk      : " + merk);
        System.out.println("Kapasitas : " + kapasitas + " Liter");
    }
}
