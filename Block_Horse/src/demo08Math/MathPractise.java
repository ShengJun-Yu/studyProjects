package demo08Math;

import java.util.Arrays;

/**
 * @author : Bojack
 * @date : 2021��10��25��20:54:22
 * ��Ŀ��
 * ������-10.8��5.9֮�䣬����ֵ����6����С��2.1�������ж��ٸ���
 */
public class MathPractise {
    public static void main(String[] args) {
        myMethod();
        System.out.println("=======================");
        goodMethod();
    }

    public static void goodMethod() {
        double num1 = -10.8;
        double num2 = 5.9;
        int n = 0;
        for (double i = Math.ceil(num1); i < 5.9; i++) {
            double abs = Math.abs(i);
            if (abs < 2.1 || abs > 6) {
                System.out.println(i);
                n++;
            }
        }
        System.out.println(n);
    }

    public static void myMethod() {
        double num1 = -10.8;
        double num2 = 5.9;
        double num3 = Math.abs(num1);
        int n = 0;
        for (double i = Math.floor(num3); i >= 0; i--) {
            if (i > 6 || i < 2.1) {
                System.out.println(-i);
                n++;
            }
        }
        for (double i = Math.floor(num2); i > 0; i--) {
            if (i > 6 || i < 2.1) {
                System.out.println(i);
                n++;
            }
        }
        System.out.println(n);
    }
}
