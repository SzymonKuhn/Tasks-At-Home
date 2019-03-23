package pl.szymonkuhn.ioTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class WordsFromFile {
    public static void main(String[] args) {
        Path fileToRead = Paths.get("D:\\JavaTasks\\words\\words.txt");
        System.out.println("File exists? " + Files.exists(fileToRead));
        String readText = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileToRead.toString()))) {
            readText = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(readText);
        Map<String, Integer> mapOfWords = countWords(readText);
        System.out.println(mapOfWords);


    }

    static Map<String, Integer> countWords(String input) {
        Map<String, Integer> mapOfWords = new HashMap<>();
        String[] words = input.split(" ");
        outer:
        for (String word : words) {
            if (mapOfWords.containsKey(word)) {
                    int value = mapOfWords.get(word);
                    value++;
                    mapOfWords.replace(word, value);
                    continue outer;
                }
            mapOfWords.put(word, 1);
        }
        return mapOfWords;
    }
}

