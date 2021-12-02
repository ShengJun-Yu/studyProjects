package demo28Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Bojack
 * @date : Created in 21:13 2021.12.02
 *     - java.utils.Collections�Ǽ��Ϲ����࣬�����Լ��Ͻ��в��������ַ������£�
 *         public static <T> void sort(List<T> list):��������Ԫ�ذ���Ĭ�Ϲ�������
 *     ע��:
 *          sort(List<T> list)ʹ��ǰ��
 *          ������ļ�����ߴ洢��Ԫ��,����ʵ��Comparable,��д�ӿ��еķ���compareTo��������Ĺ���
 *
 *     Comparable�ӿڵ��������:
 *         �Լ�(this)-����:����
 */
public class SortMain {
    public static void main(String[] args) {
        Person p1= new Person("Jun",18);
        Person p2= new Person("Sheng",14);
        Person p3= new Person("Yu",16);
        ArrayList<Person> p=new ArrayList<>();
        Collections.addAll(p,p1,p2,p3);
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);
    }
}
