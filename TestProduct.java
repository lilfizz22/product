public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product("Book", 10.00);
        TaxableProduct tp = new TaxableProduct("Laptop", 1000.00, 0.07);
        DiscountedProduct dp = new DiscountedProduct("Pen", 1.00, 0.10);

        System.out.println(p);
        System.out.println(tp);
        System.out.println(dp);
    }
}