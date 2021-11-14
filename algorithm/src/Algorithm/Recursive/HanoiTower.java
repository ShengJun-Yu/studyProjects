package Algorithm.Recursive;

import java.util.Iterator;
import java.util.Stack;

public class HanoiTower {
    static int movingCount = 0;

    public static void print(Stack<Integer> s) {
        Iterator<Integer> i = s.iterator();
        while (i.hasNext()) {
            System.out.printf("%d ", i.next());
        }
        System.out.println();
    }

    public static void resolve(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
        if (n == 0) return;
        movingCount++;
        resolve(n - 1, a, c, b);
        c.push(a.pop());
        resolve(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int count = 28;
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> c = new Stack<Integer>();

        for (int i = count; i > 0; i--) {
            a.push(i);
        }

        print(a);
        long start = System.currentTimeMillis();
        resolve(count, a, b, c);
        long end = System.currentTimeMillis();
        print(c);

        System.out.println((end - start) / 1000);
        System.out.println(movingCount);
    }
}