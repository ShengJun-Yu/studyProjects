package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021��10��13��20:54:52
 * ���ϣ���򼯺�ArrayList���д洢�����������ݣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ��
 *
 * ��������    ��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£�
 * byte        Byte
 * short       Short
 * int         Integer     �����⡿
 * long        Long
 * float       Float
 * double      Double
 * char        Character   �����⡿
 * boolean     Boolean
 *
 * ��JDK 1.5+��ʼ��֧���Զ�װ�䡢�Զ����䡣
 *
 * �Զ�װ�䣺�������� --> ��װ����
 * �Զ����䣺��װ���� --> ��������
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> num =new ArrayList<>();
        num.add(10);
        num.add(13);
        num.add(12);
        System.out.println("�����б�Ϊ��" + num);
        int size=num.size();
        System.out.println("�����б���Ϊ" + size);

    }
}
