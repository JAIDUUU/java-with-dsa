package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.Objects;

public class Student {
    public int rollNO;
    public String Name;

    public Student(String name, int rollNO) {
        Name = name;
        this.rollNO = rollNO;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;

        return rollNO == student.rollNO &&
                Objects.equals(Name, student.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNO, Name);
    }
}