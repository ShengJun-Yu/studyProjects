package demo23Integer;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 20:13 2021.11.25
 * �Զ�װ�����Զ�����:�������͵����ݺͰ�װ��֮������Զ����໥ת��
 * JDK1.5֮����ֵ�������
 */
public class IntegerAutomaticPackaging {
    public static void main(String[] args) {
    /*
    �Զ�װ��:ֱ�Ӱ�int���͵�������ֵ��װ��
            Integer in = 1; ���൱�� Integer in = new Integer(1);
     */
        Integer i = 1;
        System.out.println(i);

    /*
    �Զ� ����:in�ǰ�װ��,�޷�ֱ�Ӳ�������,�����Զ�ת��Ϊ������������,�ڽ��м���
            in+2;���൱�� in.intVale() + 2 = 3
            in = in.intVale() + 2 = 3 ����һ���Զ�װ��
     */
        i = i + 1;
        System.out.println(i);
    /*
       ArrayList�����޷�ֱ�Ӵ洢����,���Դ洢Integer��װ��
     */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //-->�Զ�װ�� list.add(new Integer(1));
        int a = list.get(0); //-->�Զ�����  list.get(0).intValue();
    }

}

