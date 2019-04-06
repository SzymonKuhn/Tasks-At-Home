package pl.szymonkuhn.ioTasks;

import java.io.BufferedWriter;
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
        Student student6 = new Student(6, "Ewa Laniwic", "department7");
        Student student7 = new Student(7, "Wiesław Lebiega", "department9");
        Student student8 = new Student(8, "Sławek Chula", "department2");
        Student student9 = new Student(9, "Basia Jankowiec", "department11");
        Student student10 = new Student(10, "Maria Zyga", "department12");
        Student student11 = new Student(11, "Jacek Kierelny", "department1");
        List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11);

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

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile.toString()))) {
            for (Student student : studentList) {
                bufferedWriter.write(student.toString() + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    } //main
} //class
