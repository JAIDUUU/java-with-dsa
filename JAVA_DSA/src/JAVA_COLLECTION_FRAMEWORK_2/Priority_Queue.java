package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    static void main(String[] args) {
        Queue<Integer> pq= new PriorityQueue<>();
        pq.offer(22);
        pq.offer(1);
        pq.offer(32);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.isEmpty());

        System.out.println(pq.size());

        System.out.println(pq.contains(22));

        pq.clear();
        System.out.println(pq);


    }
}
