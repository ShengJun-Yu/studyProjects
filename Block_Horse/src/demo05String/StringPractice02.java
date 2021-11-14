package demo05String;

import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021��10��16��16:55:59
 * ��Ŀ��
 * ��������һ���ַ���������ͳ�����и����ַ����ֵĴ�����
 * �����У���д��ĸ��Сд��ĸ�����֡�����
 * <p>
 * ˼·��
 * 1. ��Ȼ�õ��������룬�϶���Scanner
 * 2. ������������ַ�������ô��String str = sc.next();
 * 3. �����ĸ��������ֱ���������ַ����Եĳ��ִ�����
 * 4. ��Ҫ���ַ���һ���֡�һ���ּ�飬String-->char[]����������toCharArray()
 * 5. ����char[]�ַ����飬�Ե�ǰ�ַ�����������жϣ��������ĸ���������++������
 * 6. ��ӡ����ĸ��������ֱ���������ַ����ִ�����
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
        System.out.println("��д��ĸ�У�" + big);
        System.out.println("Сд��ĸ�У�" + small);
        System.out.println("�����У�" + number);
        System.out.println("�����ַ��У�" + ather);
    }
}