package singleton;

public class LazyInitialization {
    private static final ThreadLocal<LazyInitialization> instance = new ThreadLocal<>();

    private LazyInitialization() {
        System.out.println("LazyInitialization Instance Created!");
    }

    public static LazyInitialization getInstance() {
        if (instance.get() == null) {
            instance.set(new LazyInitialization());
        }
        return instance.get();
    }

    public void showMessage() {
        System.out.println("Hello from Lazy Initialization Singleton!");
    }

    // Thêm hàm main để chạy và kiểm tra Singleton
    public static void main(String[] args) {
        System.out.println("Starting Lazy Initialization Singleton Test...");

        // Lấy instance đầu tiên
        LazyInitialization singleton1 = LazyInitialization.getInstance();

        // Lấy instance thứ hai
        LazyInitialization singleton2 = LazyInitialization.getInstance();

        // Gọi phương thức để kiểm tra Singleton hoạt động
        singleton1.showMessage();

        // Kiểm tra xem hai instance có giống nhau không
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
