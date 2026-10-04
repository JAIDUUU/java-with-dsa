package JAVA_COLLECTION_FRAMEWORK_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist_java {
    public static void main(String[] args) {

        // create Integer type linked list
//        LinkedList<Integer> linkedList = new LinkedList<>();

        // create String type linked list
//        LinkedList<String> linkedlist = new LinkedList<>();

        List<Integer> list = new LinkedList<>();

        //add
        list.add(10);
        list.add(12);
        list.add(23);
        list.add(22);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        List<Integer> list2=new LinkedList<>();
        list2.add(77);
        list2.add(99);
        list2.add(88);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //clear
        System.out.println("Pehlei list "+list2);
        list2.clear();
        System.out.println("abb list "+list2.size());

        //traverse list using iterator
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println("Elements: " + iterator.next());
        }

        List<Integer> list3=new LinkedList<>();
        list3.add(12);
        list3.add(22);
        list3.add(32);
        list3.add(52);
        list3.add(62);
        System.out.println(list3);

        //get
        System.out.println(list3.get(3));

        //set
        list3.set(3,999);
        System.out.println(list3);

        //to Array
        Object [] arr=list3.toArray();
        for (Object obj:arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list3.contains(999));



        //Linked list
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(12);
        ll.add(2);
        ll.add(22);
        ll.add(41);
        ll.add(1);
        ll.add(42);

        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(32);
        System.out.println(ll);

        System.out.println(ll.peek());
        System.out.println("Before: "+ll);
        System.out.println("Polling: " + ll.poll());
        System.out.println("After: " + ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);



    }
}