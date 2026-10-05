package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(21);
        set.add(23);
        set.add(21);
        set.add(21);
        set.add(4);
        set.add(34);
        set.add(32);

        System.out.println(set);

    }
}
