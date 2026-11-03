package PBOPertemuan11;

public class Main2 {
    public static void main(String[] args) {
        Order order = new Order("ORD-001", 150000.0, "budi@email.com"); 

        // Inisialisasi kalkulator ongkir
        ShippingCalculator calculator = new ShippingCalculator();

        // Baris yang MEMILIH SicepatShipping
        ShippingMethod sicepat = new SicepatShipping();

        // Hitung biaya menggunakan Sicepat
        int ongkirSicepat = calculator.cost(order, sicepat);

        System.out.println("Biaya pengiriman SICEPAT: Rp " + ongkirSicepat);
    }
}


