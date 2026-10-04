package JAVA_COLLECTION_FRAMEWORK_1;

import java.util.*;

public class main {

    //ArrayList implementation of list
    List<String> list1= new ArrayList<>();
    // LinkedList implementation of list
    List<String> list2=new LinkedList<>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(10);
        list.add(12);
        list.add(23);
        list.add(22);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        List<Integer> list2=new ArrayList<>();
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

        List<Integer> list3=new ArrayList<>();
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

        Collection<Integer> collection=new ArrayList<>();
        collection.add(99);
        System.out.println(collection);

    }



}
