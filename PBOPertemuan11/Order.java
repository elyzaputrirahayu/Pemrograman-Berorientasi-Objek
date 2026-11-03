package PBOPertemuan11;

public class Order {
    private String id;
    private double totalPrice;
    private String customerEmail;

    // Constructor, Getter, dan Setter
    public Order(String id, double totalPrice, String customerEmail) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.customerEmail = customerEmail;
    }

    public String getId() { return id; }
    public double getTotalPrice() { return totalPrice; }
    public String getCustomerEmail() { return customerEmail; }
}
