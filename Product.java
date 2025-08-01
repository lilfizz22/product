public class Product {
    protected String productName;
    protected double basePrice;

    public Product(String productName, double basePrice) {
        this.productName = productName;
        this.basePrice = basePrice;
    }

    public double getFinalPrice() {
        return basePrice;
    }

    public String toString() {
        return String.format("Product: %s, Price: $%.2f", productName, getFinalPrice());
    }
}