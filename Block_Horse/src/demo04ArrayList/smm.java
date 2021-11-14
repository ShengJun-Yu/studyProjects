package demo04ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : Bojack
 * @date :

��Ŀ��
��һ���󼯺ϴ���20��������֣�Ȼ��ɸѡ���е�ż��Ԫ�أ��ŵ�С���ϵ��С�
Ҫ��ʹ���Զ���ķ�����ʵ��ɸѡ��

������
1. ��Ҫ����һ���󼯺ϣ������洢int���֣�<Integer>
2. ������־���Random nextInt
3. ѭ��20�Σ���������ַ���󼯺ϣ�forѭ����add����
4. ����һ����������������ɸѡ��
ɸѡ�����ݴ󼯺ϣ�ɸѡ����Ҫ���Ԫ�أ��õ�С���ϡ�
��Ҫ��
����ֵ���ͣ�ArrayListС���ϣ�����Ԫ�ظ�����ȷ����
�������ƣ�getSmallList
�����б�ArrayList�󼯺ϣ�װ��20��������֣�
5. �жϣ�if����ż����num % 2 == 0
6. �����ż�����ͷŵ�С���ϵ��У����򲻷š�
*/
public class smm {
        public static void main(String[] args) {
            ArrayList<Integer> bigList = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                int num = r.nextInt(100) + 1; // 1~100
                bigList.add(num);
            }

            ArrayList<Integer> smallList = getSmallList(bigList);

            System.out.println("ż���ܹ��ж��ٸ���" + smallList.size());
            for (int i = 0; i < smallList.size(); i++) {
                System.out.println(smallList.get(i));
            }
        }

        // ������������մ󼯺ϲ���������С���Ͻ��
        public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
            // ����һ��С���ϣ�����װż�����
            ArrayList<Integer> smallList = new ArrayList<>();
            for (int i = 0; i < bigList.size(); i++) {
                int num = bigList.get(i);
                if (num % 2 == 0) {
                    smallList.add(num);
                }
            }
            return smallList;
        }
    }


