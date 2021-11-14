package Algorithm.Recursive;

public class Fibonacci {
    public static void main(String[] args) {
        //数列：1，1，2，3，5，8 ......
        for (int i = 1; i < 10; i++) {
            System.out.print(f(i) + " ");//输出数列的第几位
        }

    }

    /**
     * 斐波那契数列递归算法
     *
     * @param n
     * @return
     */
    public static int f(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    /**
     * 1、1、2、3、5、8、13、21、34
     * 斐波那契数列的非递归解法
     */
    public static long fibnacci(int n)  //函数定义
    {
        long oneback = 1, twoback = 1, current = -1;
        // fibnacci(1)=fibnacci(2)=1
        int i;
        if (n == 1 || n == 2)
            return 1;
        else {
            for (i = 3; i <= n; i++) {
                current = oneback + twoback;
                oneback = twoback;
                twoback = current;
            }
        }
        return current;
    }
}
