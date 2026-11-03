package PBOPertemuan11;

public class SicepatShipping implements ShippingMethod {
    @Override
    public int cost(Order order) {
        // Tentukan tarif untuk SICEPAT, misal: 18000
        return 18000;
    }
}

