package PPBOpertemuan2;

public class demosemua {
    public static void main(String[] args) {
        PC10 pcRakitan = new PC10("Custom Gaming", "AMD Ryzen 7 5700X");
        laptop10 laptopKu = new laptop10("Lenovo ThinkPad", "Intel Core i7", 85, 1.4f);
        magiccom10 riceCooker = new magiccom10("Miyako", 2);
        HP10 MyHP = new HP10("Samsung", "A14", "2", 3);

        System.out.println("==========================================");
        System.out.println("             PENGUJIAN OBJEK PC           ");
        System.out.println("==========================================");
        pcRakitan.cetakInformasi();
        pcRakitan.nyalakan();
        pcRakitan.matikan();

        System.out.println("\n==========================================");
        System.out.println("           PENGUJIAN OBJEK LAPTOP         ");
        System.out.println("==========================================");
        laptopKu.cetakInformasi();
        laptopKu.nyalakan();
        laptopKu.cekBaterai();
        laptopKu.lipatLaptop();
        laptopKu.matikan();

        System.out.println("\n==========================================");
        System.out.println("           PENGUJIAN OBJEK HP         ");
        System.out.println("==========================================");
        MyHP.telepon(null);
        MyHP.foto();
        MyHP.cetakInformasi();
        

        System.out.println("\n==========================================");
        System.out.println("        PENGUJIAN OBJEK MAGIC COM         ");
        System.out.println("==========================================");
        riceCooker.cetakInformasi();
        riceCooker.memasakNasi();
        riceCooker.menghangatkanNasi();
    }
}

