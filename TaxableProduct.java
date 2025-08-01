public class TaxableProduct extends Product {
    private double taxRate;

    public TaxableProduct(String productName, double basePrice, double taxRate) {
        super(productName, basePrice);
        this.taxRate = taxRate;
    }

    public double getFinalPrice() {
        return basePrice + basePrice * taxRate;
    }
    public String toString() {
        return String.format("Taxable Product: %s, Final Price: $%.2f", productName, getFinalPrice());
    }
}
