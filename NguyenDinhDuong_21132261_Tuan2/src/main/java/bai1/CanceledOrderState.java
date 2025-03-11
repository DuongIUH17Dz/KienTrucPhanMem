package bai1;

class CanceledOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Hủy đơn hàng: Hoàn tiền cho khách.");
    }
}
