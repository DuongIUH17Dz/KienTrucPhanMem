package singleton;

public class ThreadSafeSingleton {
    private static final ThreadLocal<ThreadSafeSingleton> instance = new ThreadLocal<>();

    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton Instance Created!");
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance.get() == null) {
            instance.set(new ThreadSafeSingleton());
        }
        return instance.get();
    }

    public void showMessage() {
        System.out.println("Hello from ThreadSafe Singleton!");
    }

    // Hàm main để kiểm tra Singleton trong môi trường đa luồng
    public static void main(String[] args) {
        System.out.println("Starting Thread-Safe Singleton Test...");

        // Tạo nhiều luồng để kiểm tra tính thread-safe
        Runnable task = () -> {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> Instance: " + singleton);
        };

        // Khởi chạy 3 luồng
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
