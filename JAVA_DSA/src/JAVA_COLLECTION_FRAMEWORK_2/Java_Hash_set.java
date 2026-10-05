package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.HashSet;
import java.util.Set;

public class Java_Hash_set {
    // HashSet with default capacity and load factor
//    HashSet<Integer> numbers1 = new HashSet<>();

    // HashSet with 8 capacity and 0.75 load factor
//    HashSet<Integer> numbers = new HashSet<>(8, 0.75);

    static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(23);
        set.add(23);
        set.add(8);
        set.add(21);
        set.add(21);
        set.add(23);
        set.add(5);
        set.add(23);
        set.add(3);
        set.add(32);
        System.out.println(set);

        System.out.println(set.size());

        set.remove(21);
        System.out.println(set);

        System.out.println(set.contains(22));

        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);



    }
}
