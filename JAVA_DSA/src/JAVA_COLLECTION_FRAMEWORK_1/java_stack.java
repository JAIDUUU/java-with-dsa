package JAVA_COLLECTION_FRAMEWORK_1;

import java.util.Stack;

public class java_stack {

    public static void main() {
        Stack<Integer> stack =new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.search(10));
        System.out.println(stack.empty());
    }

}
