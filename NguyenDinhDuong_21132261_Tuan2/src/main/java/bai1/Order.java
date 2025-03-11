package bai1;

public class Order {
    private OrderState state; // Trạng thái hiện tại của đơn hàng

    public Order() {
        this.state = new NewOrderState(); // Mặc định trạng thái ban đầu là "Mới tạo"
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handle(this);
    }
}
