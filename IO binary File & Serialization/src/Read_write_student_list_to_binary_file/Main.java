package Read_write_student_list_to_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tran Quang Minh", "Ninh Binh"));
        students.add(new Student(2, "Tran Quang Tuyen", "Ninh Binh"));
        students.add(new Student(3, "Tran ", "Ha Noi"));
        students.add(new Student(4, "Quan", "Ha Nam"));
        students.add(new Student(5, "T", "Ninh Binh"));
        writeToFile("src/Read_write_student_list_to_binary_file/students.txt",students);
        List<Student> studentData = readDataFromFile("src/Read_write_student_list_to_binary_file/students.txt");
        for (Student student : studentData) {
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<Student>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
