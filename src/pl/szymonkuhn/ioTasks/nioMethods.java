package pl.szymonkuhn.ioTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nioMethods {
    public static void main(String[] args) {
        Path basePath = Paths.get("D:\\JavaTasks");
        Path file1 = basePath.resolve("file1.txt");
        Path file2 = basePath.resolve("file2.txt");
        Path file3 = basePath.resolve("sub1\\sub1file3.txt");
        Path file4 = basePath.resolve("sub1\\sub1file4.txt");
        Path file5 = basePath.resolve("sub1\\sub2\\sub2file5.txt");

        Path file1parent = file1.getParent();
        Path file2parent = file2.getParent();
        Path file3parent = file3.getParent();
        Path file4parent = file4.getParent();
        Path file5parent = file5.getParent();
        System.out.println("file1 parent exist? " + Files.exists(file1parent));
        System.out.println("file2 parent exist? " + Files.exists(file2parent));
        System.out.println("file3 parent exist? " + Files.exists(file3parent));
        System.out.println("file4 parent exist? " + Files.exists(file4parent));
        System.out.println("file5 parent exist? " + Files.exists(file5parent));

        try {
            Files.createDirectories(file1parent);
            Files.createDirectories(file2parent);
            Files.createDirectories(file3parent);
            Files.createDirectories(file4parent);
            Files.createDirectories(file5parent);
            Files.createFile(file1);
            Files.createFile(file2);
            Files.createFile(file3);
            Files.createFile(file4);
            Files.createFile(file5);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("file5 exist? " + Files.exists(file5));
        System.out.println("file5parent exist? " + Files.exists(file5parent));
        System.out.println("file5 delete");
        try {
            Files.delete(file5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file5 exist? " + Files.exists(file5));



    }
}
