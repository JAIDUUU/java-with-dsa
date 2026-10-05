package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.LinkedList;
import java.util.Queue;

public class main {

//    //Linked list implementation of Queue
//    Queue<Integer> animal1=new LinkedList<>();
//    //Array implementation of Queue
//    Queue<Integer> animal2 = new ArrayDeque<>();
//    //Priority Queue implementation of Queue
//    Queue<Integer> animal3=new PriorityQueue<>();

     public static void main(String[] args) {

         Queue<String> q = new LinkedList<>();

         q.offer("Dog");      // element add karta hai
         System.out.println(q);
         q.add("Cat");       // element add karta hai
         System.out.println(q);

         q.peek();            // front element dekhta hai
         System.out.println(q);
         q.element();         // front element dekhta hai
         System.out.println(q);

         q.poll();            // front element remove + return
         System.out.println(q);
         q.remove();          // front element remove + return
         System.out.println(q);

         q.isEmpty();         // Queue empty hai?
         System.out.println(q);
         q.size();            // Queue ka size
         System.out.println(q);
         q.contains("Dog");   // element present hai?
         System.out.println(q);
         q.clear();           // puri Queue empty
         System.out.println(q);

         System.out.println(q);

     }
}
