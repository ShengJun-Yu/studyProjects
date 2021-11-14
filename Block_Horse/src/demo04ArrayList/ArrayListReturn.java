package demo04ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021��10��13��23:25:34
 * ��Ŀ��
 * ��һ���󼯺ϴ���20��������֣�Ȼ��ɸѡ���е�ż��Ԫ�أ��ŵ�С���ϵ��С�
 * Ҫ��ʹ���Զ���ķ�����ʵ��ɸѡ��
 * <p>
 * ������
 * 1. ��Ҫ����һ���󼯺ϣ������洢int���֣�<Integer>
 * 2. ������־���Random nextInt
 * 3. ѭ��20�Σ���������ַ���󼯺ϣ�forѭ����add����
 * 4. ����һ����������������ɸѡ��
 * ɸѡ�����ݴ󼯺ϣ�ɸѡ����Ҫ���Ԫ�أ��õ�С���ϡ�
 * ��Ҫ��
 * ����ֵ���ͣ�ArrayListС���ϣ�����Ԫ�ظ�����ȷ����
 * �������ƣ�getSmallList
 * �����б�ArrayList�󼯺ϣ�װ��20��������֣�
 * 5. �жϣ�if����ż����num % 2 == 0
 * 6. �����ż�����ͷŵ�С���ϵ��У����򲻷š�
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 20; i++) {
            int num = ran.nextInt(50) + 1;
            biglist.add(num);
        }
        System.out.println(biglist);

        //�������
        ArrayList<Integer> sm = new ArrayList<>();
        sm = getsmall(biglist);
        for (int i = 0; i < sm.size(); i++) {
            System.out.println(sm.get(i));
        }
        //ֱ�ӵ���
        System.out.println(getsmall(biglist));
    }

    public static ArrayList<Integer> getsmall(ArrayList<Integer> biglist) {
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            if (biglist.get(i) % 2 == 0) {
                smalllist.add(biglist.get(i));
            }
        }
        return smalllist;
    }
}
