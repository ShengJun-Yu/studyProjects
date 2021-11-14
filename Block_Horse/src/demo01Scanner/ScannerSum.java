package demo01Scanner;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021年10月11日20:57:41
 * 键盘输入两个int数字，并且求出和值。
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = num.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = num.nextInt();
        int sum = num1 + num2;
        System.out.println("两数字和为" + sum);
    }
}
