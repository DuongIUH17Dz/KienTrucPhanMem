package bai1;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Directory root = new Directory("Root");

        File file1 = new File("Document.pdf");
        File file2 = new File("Image.png");

        Directory subDir1 = new Directory("SubFolder1");
        Directory subDir2 = new Directory("SubFolder2");

        File file3 = new File("Notes.txt");

        // Xây dựng cây thư mục
        root.add(file1);
        root.add(file2);
        root.add(subDir1);

        subDir1.add(file3);
        subDir1.add(subDir2);

        subDir2.add(new File("Music.mp3"));

        // Hiển thị cây thư mục
        root.display();
    }
}
