package pl.szymonkuhn.ioTasks;

import java.io.File;
import java.io.IOException;

public class ioMethods {
    public static void main(String[] args) {
        File basePath = new File("D:\\JavaTasks");
        basePath.mkdirs();
        System.out.println("Base Path Exists? " + basePath.exists());

        File file1 = new File(basePath, "file1.txt");
        File file2 = new File(basePath, "file2.txt");
        File file3 = new File("D:\\JavaTasks\\sub1", "sub1file3.txt");
        File file4 = new File("D:\\JavaTasks\\sub1", "sub1file4.txt");
        File file5 = new File("D:\\JavaTasks\\sub1\\sub2", "sub2file5.txt");
        File file6 = new File("D:\\JavaTasks\\sub1\\sub2", "sub2file6.txt");
        File file7 = new File("D:\\JavaTasks\\sub1\\sub3\\sub3file7.txt");
        File file8 = new File("D:\\JavaTasks\\sub1\\sub3\\sub3file8.txt");

        File[] files = new File[]{file1, file2, file3, file4, file5, file6, file7, file8};

        for (File file : files) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file8Renamed = new File("D:\\JavaTasks\\file8renamedAndMoved.txt");
        file8.renameTo(file8Renamed);
        file6.delete();

    }
}
