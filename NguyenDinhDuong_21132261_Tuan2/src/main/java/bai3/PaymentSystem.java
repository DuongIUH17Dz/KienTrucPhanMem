package bai3;

public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("==== Thanh toán bình thường ====");
        Payment payment1 = new CreditCardPayment();
        payment1.pay(100);

        System.out.println("\n==== Thanh toán với phí xử lý ====");
        Payment payment2 = new ProcessingFeeDecorator(new PayPalPayment());
        payment2.pay(200);

        System.out.println("\n==== Thanh toán với mã giảm giá ====");
        Payment payment3 = new DiscountDecorator(new CreditCardPayment());
        payment3.pay(300);

        System.out.println("\n==== Thanh toán với cả phí xử lý & mã giảm giá ====");
        Payment payment4 = new ProcessingFeeDecorator(new DiscountDecorator(new PayPalPayment()));
        payment4.pay(500);
    }
}
