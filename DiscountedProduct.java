public class DiscountedProduct extends Product {
    private double discountRate;

    public DiscountedProduct(String productName, double basePrice, double discountRate) {
        super(productName, basePrice);
        this.discountRate = discountRate;
    }

    public double getFinalPrice() {
        return basePrice - basePrice * discountRate;
    }

    public String toString() {
        return String.format("Discounted Product: %s, Final Price: $%.2f", productName, getFinalPrice());
    }
}
