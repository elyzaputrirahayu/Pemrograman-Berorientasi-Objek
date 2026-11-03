package PBOPertemuan11;

public class OrderValidator {
    public boolean validate(Order order) {
        System.out.println("Memvalidasi data pesanan...");
        // Logika validasi (misal: harga tidak boleh minus)
        return order.getTotalPrice() > 0 && order.getCustomerEmail().contains("@");
    }
}

