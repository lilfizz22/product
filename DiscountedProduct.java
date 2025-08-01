public class DiscountedProduct extends Product {
    private double discountRate;

    public DiscountedProduct(String productName, double basePrice, double discountRate) {
        super(productName, basePrice);
        this.discountRate = discountRate;
    }

    @Override
    public double getFinalPrice() {
        return basePrice - basePrice * discountRate;
    }

    @Override
    public String toString() {
        return String.format("Discounted Product: %s, Final Price: $%.2f", productName, getFinalPrice());
    }
}