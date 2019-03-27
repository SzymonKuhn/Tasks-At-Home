package pl.szymonkuhn.ioTasks;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NumbersTask {
    public static void main(String[] args) {

//        0 - dir
//          1-10 - file
//          11-20 - file
//          21-30 - file
//          31-40 - file
//          ....
//          91-100 - file
//        100 - dir
//          101-110 - file
//          .....
//        .....
//        900 - dir
//          ....
//          991- 1000

        Path basePath = Paths.get("D:\\JavaTasks\\numbers");
        if (!Files.exists(basePath)) {
            try {
                Files.createDirectories(basePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int start = 0;
        int sum = 0;
        String fileName = new String();
        String dirName = new String();
        String fileContent = new String();
        dirName = "0";
        System.out.println("dir name: " + dirName);
        createDir(basePath.toString(), dirName);

        for (int i = 0; i <= 1000; i++) {
            sum = sum + i;
            if (i % 10 == 0 && i != 0) {
                fileName = start + "-" + i + ".txt";
                fileContent = String.valueOf(sum);
                System.out.println("file name: " + fileName + " - with sum: " + fileContent); //sprawdzenie
                createFile(basePath.toString(), dirName, fileName, fileContent);
                sum = 0;
                start = i + 1;
            }

            if (((i % 100) == 0) && (i != 1000) && (i != 0)) {
                dirName = String.valueOf(i);
                System.out.println("create dir: " + dirName);
                createDir(basePath.toString(), dirName);
            }
        }
    } //main

    static void createDir(String path, String nameDir) {
        Path dir = Paths.get(path + "\\" + nameDir);
        if (!Files.exists(dir)) {
            try {
                Files.createDirectories(dir);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void createFile(String path, String dir, String fileName, String fileContent) {
        Path file = Paths.get(path + "\\" + dir + "\\" + fileName);
        Path parent = file.getParent();
        if (!Files.exists(parent))
            try {
                Files.createDirectories(parent);
            } catch (IOException e) {
                e.printStackTrace();
            }

        try {
            Files.createFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter(file.toString())) {
            writer.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} //class

