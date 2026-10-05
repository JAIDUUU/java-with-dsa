package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.HashSet;

public class HashSetBasics {

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student("UNLUCKEY", 1);
        Student s2 = new Student("UNLUCKEY", 1);
        Student s3 = new Student("UNLUCKEY", 1);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
    }
}