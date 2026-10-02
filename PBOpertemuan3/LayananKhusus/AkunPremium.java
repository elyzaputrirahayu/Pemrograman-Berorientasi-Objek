package PBOpertemuan3.LayananKhusus;
import LayananUtama.AkunBank;

public class AkunPremium extends PBOpertemuan3.LayananUtama.AkunBank {
    private String benefitKhusus;

    public AkunPremium (String nomorAkun, double tingkatBunga, String benefit) {
    // Memanggil konstruktor super-class
    super (nomorAkun, tingkatBunga);
    this.benefitKhusus = benefit;
    }

    public void berikanBonusBunga() {
    // Atribut 'tingkatBunga' dari AkunBank dapat diakses langsung karena
    // bersifat protected
    double bungaBonus = tingkatBunga + 1.5;
    // Method 'sesuaikanBunga dapat dipanggil langsung oleh class turunan.
    sesuaikanBunga (bungaBonus);
    System.out.println("Benefit tambahan: " + benefitKhusus);
    }
}
