package JAVA_COLLECTION_FRAMEWORK_1;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class vector_java {
    //create Integer type linked list
//    Vector‹Integer> vector= new Vector<>():

    // create String type linked list
//    Vector<String> vector = new Vector<>();

    public static void main(String[] args) {
        List<Integer>list=new Vector<>();

        list.add(30);
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(10);

        System.out.println(list);
        list.sort(null);
        System.out.println(list);


        Vector<Integer> v = new Vector<>();

        v.addElement(10);
        v.addElement(20);
        v.addElement(30);

        System.out.println(v.capacity());
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.insertElementAt(99, 0);
        System.out.println(v);

        v.removeElementAt(1);
        System.out.println(v);

    }
}
