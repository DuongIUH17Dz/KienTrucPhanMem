package bai1;

import java.util.ArrayList;
import java.util.List;

class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("  📄 " + name);
    }
}





