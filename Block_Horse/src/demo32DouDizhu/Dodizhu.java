package demo32DouDizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author : Bojack
 * @date : Created in 9:03 2021.12.08
 * �������ۺϰ���:����汾
 * 1.׼����
 * 2.ϴ��
 * 3.����
 * 4.����
 * 5.����
 */
public class Dodizhu {
    public static void main(String[] args) {
//        1.׼����

//        ����һ��HashMap�������������˿���
        HashMap<Integer, String> poker = new HashMap<>();
//        ����һ��ArrayList�������������˿������
        List<Integer> indexPoker = new ArrayList<>();
//        ��������ArrayList�����������滨ɫ������
        List<String> flowew = List.of("����", "����", "÷��", "����");
        List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
//        ��������С��ע��poker����
        poker.put(1, "����");
        poker.put(2, "С��");
//        ����ʹ�õ�����123ע��indexPoker����
        Collections.addAll(indexPoker, 1, 2, 3);
        int index = 3;
//        Ƕ��ѭ����ɫ������ ��װ���˿�
        for (String n : number) {
            for (String f : flowew) {
                poker.put(index, f + n);
                indexPoker.add(index);
                index++;
            }
        }
//       2. ϴ�ƽ��������
        Collections.shuffle(indexPoker);
//        �����������˿���
//        System.out.println(indexPoker);
//        3.����

        ArrayList<Integer> Bojac = new ArrayList<>();
        ArrayList<Integer> Steph = new ArrayList<>();
        ArrayList<Integer> Crtrl = new ArrayList<>();
        ArrayList<Integer> DiPai = new ArrayList<>();
//        ��Ϊindex����Ǵ�1��ʼ���ѭ������indexpokerʱҪ��1 ��ʼѭ��
        for (int i = 1; i < indexPoker.size(); i++) {
            Integer s = indexPoker.get(i);
            if (i >=52) {
                DiPai.add(s);
            } else if (i % 3 == 0) {
                Bojac.add(s);
            } else if (i % 3 == 1) {
                Steph.add(s);
            } else if (i % 3 == 2) {
                Crtrl.add(s);
            }
        }
        System.out.println("Bojac����:");
        xun(Bojac, poker);
        System.out.println();
        System.out.println("Crtrl����:");
        xun(Crtrl, poker);
        System.out.println();
        System.out.println("Steph����:");
        xun(Steph, poker);
        System.out.println();
        System.out.println("����:");
        xun(DiPai, poker);
    }
/*
��������
 */
    public static void xun(ArrayList<Integer> list, HashMap<Integer, String> poker) {
//        ����
        Collections.sort(list);
//        ����ÿ����ҵ���
        for (int i = 0; i < list.size(); i++) {
//            ʹ��HashMap��get������Key��ȡValue
            String s = poker.get(list.get(i));
//            ���Value
            System.out.print(s + " "+i);
        }
    }

}
