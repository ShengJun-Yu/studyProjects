package demo04ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021��10��13��20:59:43
 * ��Ŀ��
 * ����6��1~33֮��������������ӵ����ϣ����������ϡ�
 * <p>
 * ˼·��
 * 1. ��Ҫ�洢6�����֣�����һ�����ϣ�<Integer>
 * 2. �������������Ҫ�õ�Random
 * 3. ��ѭ��6�Σ�������6��������֣�forѭ��
 * 4. ѭ���ڵ���r.nextInt(int n)��������33��0~32������+1����1~33
 * 5. ��������ӵ������У�add
 * 6. �������ϣ�for��size��get
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> ran = new ArrayList<>();
        int i = 0;
        while (i <= 5) {
            Random num=new Random();
            int r=num.nextInt(33)+1;
            ran.add(r);
            i++;
        }
        for (int a = 0; a < ran.size(); a++) {
            System.out.println(ran.get(a));
        }
    }
}
