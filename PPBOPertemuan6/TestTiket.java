package PPBOPertemuan6;

public class TestTiket {
    public static void main(String[] args) {
        // 1. Objek Tiket Kereta (Menggunakan Konstruktor TANPA Parameter)
        TiketKereta kereta = new TiketKereta();
        kereta.kodeTiket = "KA-001";
        kereta.namaPenumpang = "Andi";
        kereta.asal = "Malang";
        kereta.tujuan = "Jakarta";
        kereta.hargaDasar = 350000;
        kereta.nomorGerbong = 3;
        kereta.nomorKursi = "12A";

        System.out.println("============ Tiket Kereta ============");
        kereta.tampilTiketKereta();
        System.out.println();

        // 2. Objek Tiket Pesawat Domestik (Menggunakan Konstruktor Berparameter)
        TiketDomestik domestik = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        System.out.println("======== Tiket Pesawat Domestik ========");
        domestik.tampilDomestik();
        System.out.println();

        // 3. Objek Tiket Pesawat Internasional (Menggunakan Konstruktor Berparameter)
        TiketInternasional internasional = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        System.out.println("====== Tiket Pesawat Internasional ======");
        internasional.tampilInternasional();
    }
}