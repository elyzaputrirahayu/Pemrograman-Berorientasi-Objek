package PBOPertemuan11;

public class Main3 {
    public static void main(String[] args) {
        // 1. Membuat objek WhatsAppSender
        MessageSender waSender = new WhatsAppSender();

        // 2. Memasukkan waSender ke dalam constructor NotificationService
        NotificationService notification = new NotificationService(waSender);

        // 3. Mengirim notifikasi
        notification.notifyCustomer("081234567890", "Halo! Pesanan toko Anda telah diproses.");
    }
}


