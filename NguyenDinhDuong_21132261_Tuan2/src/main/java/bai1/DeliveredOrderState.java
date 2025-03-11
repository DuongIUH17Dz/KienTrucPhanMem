package bai1;

class DeliveredOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Đã giao: Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
