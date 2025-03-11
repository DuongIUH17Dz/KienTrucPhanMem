package bai2;

public class Product {
    private String name;
    private double basePrice;
    private TaxStrategy taxStrategy; // Chiến lược thuế

    public Product(String name, double basePrice, TaxStrategy taxStrategy) {
        this.name = name;
        this.basePrice = basePrice;
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double getPriceWithTax() {
        return basePrice + taxStrategy.calculateTax(basePrice);
    }

    public void displayInfo() {
        System.out.println(name + " | Giá gốc: $" + basePrice + " | Giá sau thuế: $" + getPriceWithTax());
    }
}
