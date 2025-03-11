package bai2;

public class TaxStrategyPatternDemo {
    public static void main(String[] args) {
        // Tạo sản phẩm với các loại thuế khác nhau
        Product phone = new Product("iPhone 15", 1000, new LuxuryTax()); // Áp dụng thuế xa xỉ
        Product laptop = new Product("MacBook Pro", 2000, new VATTax()); // Áp dụng thuế VAT
        Product food = new Product("Bánh mì", 5, new ConsumptionTax()); // Áp dụng thuế tiêu thụ

        // Hiển thị giá sản phẩm sau thuế
        phone.displayInfo();
        laptop.displayInfo();
        food.displayInfo();

        // Thay đổi chiến lược thuế động
        phone.setTaxStrategy(new VATTax()); // Chuyển từ thuế xa xỉ sang VAT
        System.out.println("\nSau khi đổi thuế:");
        phone.displayInfo();
    }
}
