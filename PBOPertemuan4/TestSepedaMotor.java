package PBOPertemuan4;

public class TestSepedaMotor {
    public static void main(String[] args) {
        System.out.println("=== Membuat motor 1 ===");
        Mesin mesin1 = new Mesin(150, "Pertamax");
        SepedaMotor motor1 = new SepedaMotor("Honda", "Merah", mesin1, 120);
        System.out.println(motor1);

        System.out.println("\n=== Membuat motor 2 ===");
        Mesin mesin2 = new Mesin(125, "Pertalite");
        SepedaMotor motor2 = new SepedaMotor("Yamaha", "Biru", mesin2, 110);
        System.out.println(motor2);

        System.out.println("\n=== Uji behavior tambah/kurangi kecepatan ===");
        motor1.tambahKecepatan(50);
        motor1.tambahKecepatan(90);   // seharusnya di-clamp ke maxSpeed (120)
        motor1.kurangiKecepatan(200); // seharusnya di-clamp ke 0

        motor2.tambahKecepatan(80);

        System.out.println("\n=== Uji relasi Uses-A: bandingkanKecepatan ===");
        motor1.tambahKecepatan(60);
        System.out.println(motor1.bandingkanKecepatan(motor2));

        System.out.println("\n=== Uji defensive programming (harus menangkap error) ===");
        try {
            Mesin mesinSalah = new Mesin(-100, "Bensin");
        } catch (IllegalArgumentException e) {
            System.out.println("Berhasil ditangkap: " + e.getMessage());
        }

        try {
            SepedaMotor motorSalah = new SepedaMotor("Kawasaki", "Hijau", null, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Berhasil ditangkap: " + e.getMessage());
        }

        try {
            motor1.setMaxSpeed(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Berhasil ditangkap: " + e.getMessage());
        }
    }
}

