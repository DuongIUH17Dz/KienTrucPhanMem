package singleton;

import java.io.*;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
        System.out.println("SerializedSingleton Instance Created!");
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // Đảm bảo Singleton không bị phá vỡ khi Deserialize
    protected Object readResolve() {
        return getInstance();
    }

    public static void main(String[] args) {
        System.out.println("Starting Serialized Singleton Test...");

        // Lấy instance ban đầu
        SerializedSingleton instance1 = SerializedSingleton.getInstance();

        // Lưu instance xuống file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
            out.writeObject(instance1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc instance từ file
        SerializedSingleton instance2 = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"))) {
            instance2 = (SerializedSingleton) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Kiểm tra hai instance có giống nhau không
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
