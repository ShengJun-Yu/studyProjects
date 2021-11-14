package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021��10��13��20:19:54
 * ArrayList���еĳ��÷����У�
 * public boolean add(E e)���򼯺ϵ������Ԫ�أ����������ͺͷ���һ�¡�����ֵ��������Ƿ�ɹ���
 * ��ע������ArrayList������˵��add��Ӷ���һ���ǳɹ��ģ����Է���ֵ���ÿɲ��á�
 * ���Ƕ����������ϣ����ѧϰ����˵��add��Ӷ�����һ���ɹ���
 * public E get(int index)���Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ�ء�
 * public E remove(int index)���Ӽ��ϵ���ɾ��Ԫ�أ�������������ţ�����ֵ���Ǳ�ɾ������Ԫ�ء�
 * public int size()����ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ�����
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList();
        boolean lose = all.add("Stephen");

        //public boolean add(E e)���򼯺ϵ������Ԫ�أ����������ͺͷ���һ�¡�����ֵ��������Ƿ�ɹ���
        System.out.println("����Ƿ�ɹ�" + lose + all);
        all.add("Bojack");
        all.add("Jack");
        all.add("Cete");
        all.add("Nana");
        System.out.println("�����б�Ϊ��" + all);

        //public E get(int index)���Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ�ء�
        String name = all.get(2);
        System.out.println("����Ԫ��Ϊ��" + name);

        //public E remove(int index)���Ӽ��ϵ���ɾ��Ԫ�أ�������������ţ�����ֵ���Ǳ�ɾ������Ԫ�ء�
        String removewho = all.remove(2);
        System.out.println("��ɾ������Ϊ��" + removewho);
        System.out.println("ɾ������λ�ú�������б�Ϊ��" + all);

        //public int size()����ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ�����
        int num = all.size();
        System.out.println("�����б���Ϊ" + num);


    }
}
