package demo01Scanner;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021��10��11��20:57:41
 * ������������int���֣����������ֵ��
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("�������һ������");
        int num1 = num.nextInt();
        System.out.println("������ڶ�������");
        int num2 = num.nextInt();
        int sum = num1 + num2;
        System.out.println("�����ֺ�Ϊ" + sum);
    }
}
