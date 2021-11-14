package demo07Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021年10月25日19:59:29
 * 题目：
 * 请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class ArraysPractise {
    public static void main(String[] args) {
        String str="gygewwfgiuirwuuiwgvue";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }


    }

}
