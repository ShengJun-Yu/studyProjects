package Algorithm.Stack;

import java.util.Stack;

public class JavaStackTest {
    public static void main(String[] args) {
        testStack();
        System.out.println();
       // testDeque();
    }

    public static void testStack() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
