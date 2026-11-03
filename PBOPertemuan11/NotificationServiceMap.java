package PBOPertemuan11;
import java.util.HashMap;
import java.util.Map;

public class NotificationServiceMap {
    // 1. Deklarasi field menggunakan Map (Key: String nomor, Value: String teks pesan)
    private Map<String, String> sent = new HashMap<>();

    void log(String to, String text) {
        sent.put(to, text); // Menggunakan put untuk menyimpan ke dalam Map
    }

    // Contoh metode pencarian untuk mendemonstrasikan satu baris pencariannya
    void cariRiwayat(String nomorPenerima) {
        // 2. SATU BARIS PENCARIANNYA menggunakan method .get()
        String hasilPesan = sent.get(nomorPenerima);
        
        System.out.println("Pesan untuk " + nomorPenerima + ": " + hasilPesan);
    }
}
