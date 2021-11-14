package Algorithm.Recursive_Apple;

import java.util.Scanner;
public class 回文串 {
    public static void main(String[] args) {
        String checkStr = null;
        System.out.println("请输入要检测的字符串：");
        Scanner in = new Scanner(System.in);
        checkStr = in.nextLine();        // 存储用户输入的字符串
        if (isPaildrome(checkStr)) {        // 判断输入的字符串是否为回文串
            System.out.println(checkStr + "是回文串。");
        } else {
            System.out.println(checkStr + "不是回文串。");
        }
    }

    private static boolean isPaildrome(String check) {
        int low = 0;                // 定义首字符的索引
        int high = check.length() - 1;        // 定义尾子符的索引
        while (low < high) {
            // 检测首尾两个字符是否相等
            if (check.charAt(low) != check.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
/**
 * 递归法实现
 */
