package demo25List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : Bojack
 * @date : Created in 17:44 2021.12.01
 * java.util.List�ӿ� extends Collection�ӿ�
 * List�ӿڵ��ص�:
 * 1.����ļ���,�洢Ԫ�غ�ȡ��Ԫ�ص�˳����һ�µ�(�洢123 ȡ��123)
 * 2.������,������һЩ�������ķ���
 * 3.����洢�ظ���Ԫ��
 * <p>
 * List�ӿ��д������ķ���(����)
 * - public void add(int index, E element): ��ָ����Ԫ�أ���ӵ��ü����е�ָ��λ���ϡ�
 * - public E get(int index):���ؼ�����ָ��λ�õ�Ԫ�ء�
 * - public E remove(int index): �Ƴ��б���ָ��λ�õ�Ԫ��, ���ص��Ǳ��Ƴ���Ԫ�ء�
 * - public E set(int index, E element):��ָ��Ԫ���滻������ָ��λ�õ�Ԫ��,����ֵ�ĸ���ǰ��Ԫ�ء�
 * ע��:
 * ����������ʱ��,һ��Ҫ��ֹ����Խ���쳣
 * IndexOutOfBoundsException:����Խ���쳣,���ϻᱨ
 * ArrayIndexOutOfBoundsException:��������Խ���쳣
 * StringIndexOutOfBoundsException:�ַ�������Խ���쳣
 */
public class List01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
//        - public void add(int index, E element): ��ָ����Ԫ�أ���ӵ��ü����е�ָ��λ���ϡ�
        list.add(3, "Jun");
        System.out.println(list);
//        - public E remove(int index): �Ƴ��б���ָ��λ�õ�Ԫ��, ���ص��Ǳ��Ƴ���Ԫ�ء�
        String remove = list.remove(1);
        System.out.println("���Ƴ���Ԫ�أ�" + remove);
        System.out.println(list);
//        - public E set(int index, E element):��ָ��Ԫ���滻������ָ��λ�õ�Ԫ��,����ֵ�ĸ���ǰ��Ԫ�ء�
        String a = list.set(4, "A");
        System.out.println("���滻��Ԫ�أ�" + a);
        System.out.println(list);
//        - public E get(int index):���ؼ�����ָ��λ�õ�Ԫ�ء�
//        ��ͨѭ������
        for (int i = 0; i < list.size(); i++) {
            String li = list.get(i);
            System.out.print(li);

        }
        System.out.println();
        System.out.println("===================");
//        ��ǿforѭ������
        for (String l : list) {
            System.out.print(l);
        }
        System.out.println();
        System.out.println("===================");
//        ����������
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next);
        }
    }

}
