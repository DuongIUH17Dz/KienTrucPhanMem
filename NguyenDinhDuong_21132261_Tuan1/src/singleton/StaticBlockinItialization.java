package singleton;

public class StaticBlockinItialization {
    private static final StaticBlockinItialization instance;

    private StaticBlockinItialization() {
        System.out.println("StaticBlockInitialization Instance Created!");
    }

    // Static block để khởi tạo instance
    static {
        try {
            instance = new StaticBlockinItialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockinItialization getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Static Block Initialization Singleton!");
    }

    // Hàm main để kiểm tra Singleton
    public static void main(String[] args) {
        System.out.println("Starting Static Block Initialization Singleton Test...");

        // Lấy instance đầu tiên
        StaticBlockinItialization singleton1 = StaticBlockinItialization.getInstance();

        // Lấy instance thứ hai
        StaticBlockinItialization singleton2 = StaticBlockinItialization.getInstance();

        // Gọi method để kiểm tra Singleton hoạt động
        singleton1.showMessage();

        // Kiểm tra xem hai instance có giống nhau không
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
