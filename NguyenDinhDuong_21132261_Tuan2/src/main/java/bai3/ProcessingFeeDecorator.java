package bai3;

class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        double fee = amount * 0.02; // Phí 2%
        System.out.println("Thêm phí xử lý: $" + fee);
        super.pay(amount + fee);
    }
}
