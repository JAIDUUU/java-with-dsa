package JAVA_COLLECTION_FRAMEWORK_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_queue {
    public static void main(String[] args) {
        Deque<Integer> q=new ArrayDeque<>();
        //Queue: First In → First Out
        q.offer(33);
        q.offer(21);
        q.offer(3);
        q.offer(54);
        q.offer(2);
        q.offer(67);
        q.offer(65);

        System.out.println(q.peek());
        System.out.println(q.poll());

        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(12);
        stack.push(23);

        System.out.println(stack.peek());
        System.out.println(stack.pop());



    }

}
