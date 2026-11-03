package PBOPertemuan7;

public class TestKepegawaian {
    public static void main(String[] args) {
        // CATATAN: angka gaji di bawah ini contoh saja.
        // Ganti sesuai angka asli yang tertulis di slide kamu.
        Manajer man = new Manajer("Bill Gates", 3000000);
        Supervisor spv = new Supervisor("Susanto", 1000000);
        SalesManajer sman = new SalesManajer("Jessica", "IT", 2000000);

        man.naikkanGaji();
        spv.naikkanGaji();
        sman.naikkanGaji();

        man.cetakStatus();
        spv.cetakStatus();
        sman.cetakStatus();
    }
}