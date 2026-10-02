package PBOpertemuan3;

public class Mobil {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void tampilkanStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        }

        else {
            System.out.println("Kontak OFF");
        }

        System.out.println("Kecepatan " + kecepatan + "\n");
    }

    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        
        mbl.tampilkanStatus();
        mbl.kecepatan = 100;
        mbl.tampilkanStatus();
    }
}
