package demo03Random;

import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021年10月12日20:10:22
 * 题目要求：
 * 根据int变量n的值，来获取随机数字，范围是[1,n]，可以取到1也可以取到n。
 * <p>
 * 思路：
 * 1. 定义一个int变量n，随意赋值
 * 2. 要使用Random：三个步骤，导包、创建、使用
 * 3. 如果写10，那么就是0~9，然而想要的是1~10，可以发现：整体+1即可。
 * 4. 打印随机数字
 */
public class Random03 {
    public static void main(String[] args) {
        int n = 4;
        java.util.Random nun = new java.util.Random();
        for (int i = 0; i < 100; i++) {
            int num1= nun.nextInt(n)+1;
            System.out.println(num1+"|");

        }


    }
}
