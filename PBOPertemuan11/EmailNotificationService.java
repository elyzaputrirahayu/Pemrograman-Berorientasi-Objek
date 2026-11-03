package PBOPertemuan11;

public class EmailNotificationService {
    public void sendConfirmationEmail(Order order) {
        System.out.println("Mengirimkan email konfirmasi ke: " + order.getCustomerEmail());
        // Logika pengiriman email (JavaMail API)
    }
}
