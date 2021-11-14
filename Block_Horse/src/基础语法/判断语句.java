package 基础语法;

/**
 * @author : Bojack
 * @date : 2021年9月22日17:12:15
 */

public class 判断语句 {
    public static void main(String[] args) {
        判断语句if();
        判断语句ifelse();
        a();
    }

    /**
     * 判断语句 if
     */
    public static void 判断语句if() {
        System.out.println("今天天气正好，我正在闲逛，突然发现一个快乐的地方“网吧“");
        int age = 16;
        if (age >= 18) {
            System.out.println("进入玩吧，开始high！");
            System.out.println("遇到一群猪");
            System.out.println("骂完人回家");
        }
        System.out.println("未满18周岁禁止进入，回家吃饭");
    }

    /**
     * 判断语句 if  else
     */
    public static void 判断语句ifelse() {
        int num = 888;
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    /**
     * 判断语句if..else if...else
     */
    public static void a() {
        int x = 88;
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (-1 < x && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println("结果为y=" + y);
    }

}

