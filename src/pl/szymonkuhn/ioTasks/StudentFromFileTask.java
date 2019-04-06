package pl.szymonkuhn.ioTasks;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentFromFileTask {
    public static void main(String[] args) {
        Path inputFile = Paths.get("D://JavaTasks/students/students.txt");
        System.out.println("Input file exist: " + Files.exists(inputFile));

        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile.toString()))) {
            String inputString;
            do {
                inputString = reader.readLine();
                if (inputString != null) {
                    stringList.add(inputString);
                }
            } while (inputString != null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < stringList.size(); i++) {
            Student student = createStudent(stringList.get(i));
            studentList.add(student);
        }
        System.out.println(studentList);


    } //main

    static int getIntFromString(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            e.getMessage();
        }
        return 0;
    }

    static Student createStudent(String input) {
        Integer id;
        String name;
        String department;
        String[] array = input.split("; ");
        id = getIntFromString(array[0]);
        name = array[1];
        department = array[2];
        return new Student(id, name, department);
    }
} //class

