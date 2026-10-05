package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasics {
    public static void main(String[] args) {
        Deque<Integer> q=new ArrayDeque<>();
        q.offer(5);
        q.offer(8);
        q.offer(53);
        q.offer(2);
        q.offer(21);
        q.offer(3);
        q.offer(7);
        q.offer(43);
        q.offer(3);
        System.out.println(q);

        q.poll();
        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.isEmpty());

        System.out.println(q.size());

        q.addFirst(999);
        System.out.println(q);

        q.addLast(99);
        System.out.println(q);

        q.removeFirst();
        System.out.println(q);

        q.removeLast();
        System.out.println(q);

        System.out.println(q.peekFirst());

        System.out.println(q.peekLast());

    }
}
