package PBOPertemuan2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KIPAS ANGIN ===");
        KipasAngin kipas = new KipasAngin("Maspion", "Putih", 16.0f);
        kipas.nyalakanKipas();
        kipas.tambahKecepatan();
        kipas.tambahKecepatan();
        kipas.kurangiKecepatan();
        kipas.matikanKipas();
        System.out.println(kipas);

        System.out.println("\n=== HP ===");
        HP hp = new HP("Samsung", "Hitam", 128);
        hp.nyalakanHP();
        hp.tambahVolume();
        hp.kurangiVolume();
        hp.isiBaterai();
        hp.matikanHP();
        System.out.println(hp);

        System.out.println("\n=== LAPTOP ===");
        Laptop laptop = new Laptop("Asus", "Silver", 512, 16, 14.0f);
        laptop.nyalakanLaptop();
        laptop.memutarVideo();
        laptop.isiBaterai();
        laptop.matikanLaptop();
        System.out.println(laptop);

        System.out.println("\n=== SEPEDA MOTOR ===");
        SepedaMotor motor = new SepedaMotor("Honda", "Merah", "Matic", 4.0f, 2023);
        motor.nyalakanMesin();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.mengerem();
        motor.matikanMesin();
        System.out.println(motor);

        System.out.println("\n=== KULKAS ===");
        Kulkas kulkas = new Kulkas("LG", "Putih", 1.8f, 300);
        kulkas.nyalakanKulkas();
        kulkas.pengaturSuhu(2.5f);
        kulkas.matikanKulkas();
        System.out.println(kulkas);
    }
}

