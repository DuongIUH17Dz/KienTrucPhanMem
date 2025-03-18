package bai1;
import java.util.ArrayList;
import java.util.List;

// Lớp trừu tượng đại diện cho cả File và Directory
abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract void display(); // Hiển thị cấu trúc thư mục

    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Không thể thêm vào phần tử này.");
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Không thể xoá phần tử này.");
    }

    public FileSystemComponent getChild(int index) {
        throw new UnsupportedOperationException("Không thể lấy phần tử con.");
    }
}

// Lớp File (Leaf)


