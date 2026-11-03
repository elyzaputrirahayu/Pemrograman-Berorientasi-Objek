package PBOPertemuan11;

public class ShippingCalculator {
    // Sekarang menerima parameter bertipe interface ShippingMethod
    int cost(Order order, ShippingMethod shippingMethod) {
        return shippingMethod.cost(order);
    }
}
