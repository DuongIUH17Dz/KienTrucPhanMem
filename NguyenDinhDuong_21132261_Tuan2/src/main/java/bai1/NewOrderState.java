package bai1;

class NewOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Mới tạo: Kiểm tra thông tin đơn hàng.");
        order.setState(new ProcessingOrderState()); // Chuyển sang trạng thái "Đang xử lý"
    }
}
