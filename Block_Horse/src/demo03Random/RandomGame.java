package demo03Random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : 2021��10��12��20:39:04
 * ��Ŀ��
 * �ô���ģ������ֵ�С��Ϸ��
 * <p>
 * ˼·��
 * 1. ������Ҫ����һ��������֣�����һ���������ٱ仯����Random��nextInt����
 * 2. ��Ҫ�������룬�����õ���Scanner
 * 3. ��ȡ������������֣���Scanner���е�nextInt����
 * 4. �Ѿ��õ����������֣��жϣ�if��һ�£�
 * ���̫���ˣ���ʾ̫�󣬲������ԣ�
 * ���̫С�ˣ���ʾ̫С���������ԣ�
 * ��������ˣ���Ϸ������
 * 5. ���Ծ�������һ�Σ�ѭ��������ȷ������while(true)��
 */
public class RandomGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        System.out.println("���������µ���ֵ0~100");
        int i = 0;
        while (i <= 3) {
            Scanner num = new Scanner(System.in);
            int gues = num.nextInt();
            if (gues > random) {
                System.out.println("���µ�����̫����");
                i++;
            } else if (gues < random) {
                System.out.println("���µ�����̫С��");
                i++;
            } else {
                System.out.println("���¶��ˣ�");
                System.out.println("Game over,You are win!");
                break;
            }
        }
        System.out.println("Game over,You are loser!");

    }
}
