package pl.szymonkuhn.ioTasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class copyTextFromFileToFile {
    public static void main(String[] args) {
        Path fileToRead = Paths.get("D:\\JavaTasks\\sourceText.txt");
        Path fileToWrite = Paths.get("D:\\JavaTasks\\targetText.txt");

        List<Character> text = new ArrayList<>();

        System.out.println("Reading text.");
        text = getTextFromFile(fileToRead);
        for (Character ch : text) {
            System.out.print((char) ch);
        }

        System.out.println("Writing text.");
        writeTextToFile(text, fileToWrite);

    }



    static List<Character> getTextFromFile (Path path) {
        List<Character> charList = new ArrayList<>();
        try (FileReader reader = new FileReader(path.toString())){
            int readInt;
            while ((readInt = reader.read()) != -1) {
                charList.add((char)readInt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return charList;
    }

    static void writeTextToFile (List<Character> listChar, Path path) {
        try (FileWriter writer = new FileWriter(path.toString())) {
            for (Character ch : listChar) {
                writer.write(ch);
            }
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
