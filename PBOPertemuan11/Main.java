package PBOPertemuan11;

public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi data pesanan baru
        Order order = new Order("ORD-001", 150000.0, "budi@email.com");

        // 2. Inisialisasi setiap service/kelas yang memegang satu tugas
        OrderValidator validator = new OrderValidator();
        ShippingCostCalculator shippingCalculator = new ShippingCostCalculator();
        OrderRepository repository = new OrderRepository();
        EmailNotificationService emailService = new EmailNotificationService();

        // 3. Alur eksekusi program
        if (validator.validate(order)) {
            double shippingCost = shippingCalculator.calculate(order);
            System.out.println("Ongkos kirim: Rp " + shippingCost);
            
            repository.saveToFile(order);
            emailService.sendConfirmationEmail(order);
            System.out.println("Proses pesanan selesai dengan sukses!");
        } else {
            System.out.println("Pesanan tidak valid!");
        }
    }
}


