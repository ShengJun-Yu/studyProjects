package demo40MyFunctionalInterface.UsuallyUse;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author : Bojack
 * @date : Created in 19:47 2022.03.03
 * ��ϰ��������Ϣɸѡ
 * ���鵱���ж���������+�Ա𡱵���Ϣ���£�
 * String[] array = { "�����Ȱ�,Ů", "��������,Ů", "�������,��", "����ӱ,Ů" };
 * ��ͨ��Predicate�ӿڵ�ƴװ������Ҫ����ַ���ɸѡ������ArrayList�У�
 * ��Ҫͬʱ��������������
 * 1. ����ΪŮ����
 * 2. ����Ϊ4���֡�
 * <p>
 * ����:
 * 1.�������ж�����,������Ҫʹ������Predicate�ӿ�,�����������ж�
 * 2.����ͬʱ������������,���Կ���ʹ��and�������������ж�����
 */
public class demo03Predicate02Practice {
    public static ArrayList<String> method(String[] s, Predicate<String> p1, Predicate<String> p2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s1 : s) {
            boolean b = p1.test(s1) && p2.test(s1);
            if (b) {
                list.add(s1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] name = {"��ʢ��,��", "�������,Ů", "��������,Ů"};
        ArrayList<String> list=method(name, (String s) -> {
            String st1 = s.split(",")[0];
            return st1.length() >=4;
        }, (String s) -> {
            String st1 = s.split(",")[1];
            return st1.contains("Ů");
        });
        for (String i : list) {
            System.out.println(i);
        }
    }
}
