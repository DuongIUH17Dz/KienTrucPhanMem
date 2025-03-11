package bai1;

public class OrderStatePatternDemo {
    public static void main(String[] args) {
        Order order = new Order(); // Tạo đơn hàng mới

        order.processOrder(); // Chuyển từ "Mới tạo" -> "Đang xử lý"
        order.processOrder(); // Chuyển từ "Đang xử lý" -> "Đã giao"

        // Hủy đơn hàng từ trạng thái hiện tại
        order.setState(new CanceledOrderState());
        order.processOrder(); // Xử lý hoàn tiền
    }
}
