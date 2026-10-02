package PPBOPertemuan3;

import java.util.Scanner;

public class TestLogistik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer(
                "REQ-9988",
                "PT. Maju Bersama",
                5000
        );

        System.out.println("Nama Pemilik Kontainer: "
                + kontainerAlfa.getNamaPemilik());

        System.out.println("Kapasitas Maksimal: "
                + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // Input berat muatan
        System.out.print("\nMasukkan berat muatan baru (kg): ");
        double beratMasuk = input.nextDouble();

        kontainerAlfa.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input berat muatan berikutnya
        System.out.print("\nMasukkan berat muatan baru (kg): ");
        beratMasuk = input.nextDouble();

        kontainerAlfa.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input berat yang akan dibongkar
        System.out.print("\nMasukkan berat muatan yang akan dibongkar (kg): ");
        double beratTurun = input.nextDouble();

        kontainerAlfa.turunkanMuatan(beratTurun);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input berat yang akan dibongkar lagi
        System.out.print("\nMasukkan berat muatan yang akan dibongkar (kg): ");
        beratTurun = input.nextDouble();

        kontainerAlfa.turunkanMuatan(beratTurun);

        System.out.println("Berat muatan saat ini: "
                + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        input.close();
    }
}