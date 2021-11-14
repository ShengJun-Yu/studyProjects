package demo01Scanner;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021年10月11日21:04:16
 * 键盘输入三个int数字，然后求出其中的最大值。
 */
public class ScannerMax {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();
        int temp = num1 > num2 ? num1 : num2;
        int max1 = temp > num3 ? temp : num3;
        System.out.println("三数最大值为:" + max1);
        int[] max = {num1, num2, num3};
        int ma = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] > ma) {
                ma = max[i];
            }
        }
        System.out.println("三数最大值为:" + ma);

    }
}
