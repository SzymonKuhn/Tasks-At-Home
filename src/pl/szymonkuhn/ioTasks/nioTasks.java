package pl.szymonkuhn.ioTasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nioTasks {
    public static void main(String[] args) {
        Path basePath = Paths.get("D:\\JavaTasks");
        Path fileWithYourName = basePath.resolve("fileWithYourName.txt");

        System.out.println("Path exists? " + Files.exists(basePath));
        System.out.println("File exists? " + Files.exists(fileWithYourName));
        System.out.println("Creating path and file");

        if (!Files.exists(basePath)) {
            try {
                Files.createDirectories(basePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!Files.exists(fileWithYourName)) {
        try {
            Files.createFile(fileWithYourName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

        System.out.println("Path exists? " + Files.exists(basePath));
        System.out.println("File exists? " + Files.exists(fileWithYourName));

        FileWriter writer = null;
        try {
            writer = new FileWriter(fileWithYourName.toString());
            writer.write("Szymon Kuhn Ala ma kota");
            } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        try (FileWriter writer2 = new FileWriter(fileWithYourName.toString())) {
//            writer2.write("po raz drugi Szymon Kuhn");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println();
        System.out.println(fileWithYourName.toString());
        try (FileReader reader = new FileReader(fileWithYourName.toString())) {
            int read;
            while ((read = reader.read()) != -1) {
                char character = (char)read;
                System.out.print(character);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }

    }
}
