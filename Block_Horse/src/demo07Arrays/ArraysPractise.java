package demo07Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021��10��25��19:59:29
 * ��Ŀ��
 * ��ʹ��Arrays��ص�API����һ������ַ����е������ַ��������У��������ӡ��
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
