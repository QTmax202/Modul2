import Distinguish_between_HashMap_and_HashSet.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("TQT",19,"NB");
        Student student2 = new Student("FHY",19,"HN");
        Student student3 = new Student("TQ",22,"NB");

        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer,Student> entry : studentMap.entrySet()) {
            System.out.println(entry.toString());
        }

        System.out.println("---");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
//        students.add(student1);

        for (Student student :
             students) {
            System.out.println(student.toString());
        }
    }
}
