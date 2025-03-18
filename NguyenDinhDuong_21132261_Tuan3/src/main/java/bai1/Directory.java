package bai1;

import java.util.ArrayList;
import java.util.List;

class Directory extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public FileSystemComponent getChild(int index) {
        return children.get(index);
    }

    @Override
    public void display() {
        System.out.println("📂 " + name);
        for (FileSystemComponent component : children) {
            System.out.print("  ├── ");
            component.display();
        }
    }
}
