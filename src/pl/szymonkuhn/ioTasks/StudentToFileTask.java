package pl.szymonkuhn.ioTasks;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class StudentToFileTask {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Mieczysław Wierzbicki", "department1");
        Student student2 = new Student(2, "Wiesław Michalak", "department1");
        Student student3 = new Student(3, "Irena Biebrzańska", "department2");
        Student student4 = new Student(4, "Paweł Jakuwiecki", "department2");
        Student student5 = new Student(5, "Joanna Mierzejewska", "department3");
        List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5);

        Path basePath = Paths.get("D:\\JavaTasks\\students");
        Path targetFile = basePath.resolve("students.txt");

        if (!Files.exists(basePath)) {
            try {
                Files.createDirectories(targetFile.getParent());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!Files.exists(targetFile)) {
            try {
                Files.createFile(targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter writer = new FileWriter(targetFile.toString())) {
            for (Student student : studentList) {
                writer.write(student.toString());
                writer.write("tu powinna być nowa linia -> \n <- tutaj był znak nowej linii");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    } //main
} //class
