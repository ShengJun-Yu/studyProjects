

public class First_Homework {
    /**
     * 方法的调用
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "ertf";
        System.out.println(reverse1(str));
    }
    /**
     * 以下为方法
     */

    /**
     * 斐波那契数列数列
     */
    public int fib1(int n) {
        int a = 0, b = 1, sum = n;
        for (int i = 2; i <= n; i++) {
            //取模，避免越界
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    /**
     * 青蛙跳
     */
    public int numWays(int n) {
        return climb(0, n);
    }

    private int climb(int i, int n) {
        //表示当前台阶数大于总台阶数，很显然这种情况不符合，走不通，记为 0
        if (i > n) {
            return 0;
        }
        //表示当前台阶数正好等于总的台阶数，那么这种情况符合，记为 1
        if (i == n) {
            return 1;
        }
        return climb(i + 1, n) + climb(i + 2, n);
    }

    /**
     * 字符串反转
     */
    public static String reverse1(String str) {
        String stc2 = str.replace(" ", "");
        return new StringBuilder(stc2).reverse().toString();
    }

    /**
     * 汉诺塔问题
     *
     * @param n
     * @param from。
     * @param inter
     * @param to
     */
    public static void move(int n, char[] from, char[] inter, char[] to) {
        if (n == 1) {
            System.out.println(from + "移动盘子" + n + to);
        } else {
            move(n - 1, from, inter, to);
            System.out.println(from + "移动盘子" + n + to);
            move(n - 1, inter, from, to);
        }
    }
}

