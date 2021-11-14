package demo03Random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021年10月12日20:39:04
 * 题目：
 * 用代码模拟猜数字的小游戏。
 * <p>
 * 思路：
 * 1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
 * 2. 需要键盘输入，所以用到了Scanner
 * 3. 获取键盘输入的数字，用Scanner当中的nextInt方法
 * 4. 已经得到了两个数字，判断（if）一下：
 * 如果太大了，提示太大，并且重试；
 * 如果太小了，提示太小，并且重试；
 * 如果猜中了，游戏结束。
 * 5. 重试就是再来一次，循环次数不确定，用while(true)。
 */
public class RandomGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        System.out.println("请输入您猜的数值0~100");
        int i = 0;
        while (i <= 3) {
            Scanner num = new Scanner(System.in);
            int gues = num.nextInt();
            if (gues > random) {
                System.out.println("您猜的数字太大了");
                i++;
            } else if (gues < random) {
                System.out.println("您猜的数字太小了");
                i++;
            } else {
                System.out.println("您猜对了！");
                System.out.println("Game over,You are win!");
                break;
            }
        }
        System.out.println("Game over,You are loser!");

    }
}
