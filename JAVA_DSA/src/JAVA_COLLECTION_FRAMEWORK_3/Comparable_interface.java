package JAVA_COLLECTION_FRAMEWORK_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_interface {
    static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        students.add(new Students(21, "Luckey", 99));
        students.add(new Students(27, "Inzamam", 15));
        students.add(new Students(14, "mota", 199));
        students.add(new Students(31, "Rahul", 85));
        students.add(new Students(12, "Aman", 65));
        students.add(new Students(13, "Zaid", 95));
        students.add(new Students(14, "Karan", 72));

        Collections.sort(students);

        System.out.println(students);
    }
}
