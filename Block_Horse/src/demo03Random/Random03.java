package demo03Random;

import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021��10��12��20:10:22
 * ��ĿҪ��
 * ����int����n��ֵ������ȡ������֣���Χ��[1,n]������ȡ��1Ҳ����ȡ��n��
 * <p>
 * ˼·��
 * 1. ����һ��int����n�����⸳ֵ
 * 2. Ҫʹ��Random���������裬������������ʹ��
 * 3. ���д10����ô����0~9��Ȼ����Ҫ����1~10�����Է��֣�����+1���ɡ�
 * 4. ��ӡ�������
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
