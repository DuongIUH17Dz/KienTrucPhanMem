package bai1;

class ProcessingOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển.");
        order.setState(new DeliveredOrderState()); // Chuyển sang trạng thái "Đã giao"
    }
}
