package demo05String;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021年10月16日16:55:59
 * 题目：
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数。
 * 种类有：大写字母、小写字母、数字、其他
 * <p>
 * 思路：
 * 1. 既然用到键盘输入，肯定是Scanner
 * 2. 键盘输入的是字符串，那么：String str = sc.next();
 * 3. 定义四个变量，分别代表四种字符各自的出现次数。
 * 4. 需要对字符串一个字、一个字检查，String-->char[]，方法就是toCharArray()
 * 5. 遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作。
 * 6. 打印输出四个变量，分别代表四种字符出现次数。
 */
public class StringPractice02 {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        String str = si.next();
        int big = 0, small = 0, number = 0, ather = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('A' < chars[i] && chars[i] < 'Z') {
                big++;
            } else if ('a' < chars[i] && chars[i] < 'z') {
                small++;
            } else if ('0' < chars[i] && chars[i] < '9') {
                number++;
            } else {
                ather++;
            }
        }
        System.out.println("大写字母有：" + big);
        System.out.println("小写字母有：" + small);
        System.out.println("数字有：" + number);
        System.out.println("其他字符有：" + ather);
    }
}