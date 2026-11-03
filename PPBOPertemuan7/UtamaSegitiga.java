package PPBOPertemuan7;

public class UtamaSegitiga {
    public static void main(String[] args) {
        // Membuat objek dari class Segitiga
        Segitiga segitiga = new Segitiga();

        System.out.println("=== UJI METHOD OVERLOADING SEGITIGA ===");

        // 1. Menguji totalSudut dengan 1 parameter
        int hasilSudut1 = segitiga.totalSudut(60);
        System.out.println("Sudut sisa (1 parameter input: 60)   = " + hasilSudut1 + " derajat");

        // 2. Menguji totalSudut dengan 2 parameter
        int hasilSudut2 = segitiga.totalSudut(90, 30);
        System.out.println("Sudut sisa (2 parameter input: 90, 30) = " + hasilSudut2 + " derajat");

        System.out.println("---------------------------------------");

        // 3. Menguji keliling dengan 3 parameter (sisi A, B, C)
        int kelilingKelompok1 = segitiga.keliling(3, 4, 5);
        System.out.println("Keliling Segitiga Sembarang (3, 4, 5)  = " + kelilingKelompok1);

        // 4. Menguji keliling dengan 2 parameter (sisi miring c)
        double kelilingSikuSiku = segitiga.keliling(6, 8);
        System.out.println("Sisi Miring Segitiga Siku-Siku (6, 8)  = " + kelilingSikuSiku);
    }
}
