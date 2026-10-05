package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_linkedlist {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.offer(45);
        q.offer(23);
        q.offer(56);
        q.offer(76);
        q.offer(54);
        q.offer(6);
        q.offer(4);

        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.contains(54));
        q.clear();
        System.out.println(q);
    }
}
