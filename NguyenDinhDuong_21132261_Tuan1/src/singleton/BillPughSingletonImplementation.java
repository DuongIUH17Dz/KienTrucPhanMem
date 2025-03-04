package singleton;

public class BillPughSingletonImplementation {
    private BillPughSingletonImplementation() {
        System.out.println("BillPughSingleton Instance Created!");
    }

    private static class SingletonHelper {
        private static final BillPughSingletonImplementation instance = new BillPughSingletonImplementation();
    }

    public static BillPughSingletonImplementation getInstance() {
        return SingletonHelper.instance;
    }

    public void showMessage() {
        System.out.println("Hello from Bill Pugh Singleton!");
    }

    // Thêm hàm main vào trong class
    public static void main(String[] args) {
        BillPughSingletonImplementation singleton1 = BillPughSingletonImplementation.getInstance();
        BillPughSingletonImplementation singleton2 = BillPughSingletonImplementation.getInstance();

        singleton1.showMessage();

        // Kiểm tra xem hai instance có giống nhau không
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
