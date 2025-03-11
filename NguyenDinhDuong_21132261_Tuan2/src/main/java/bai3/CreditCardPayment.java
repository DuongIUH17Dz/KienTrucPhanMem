package bai3;

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán $" + amount + " bằng thẻ tín dụng.");
    }
}
