package demo25List.LinkedList;

import java.util.LinkedList;

/**
 * @author : Bojack
 * @date : Created in 18:11 2021.12.01
 * java.util.LinkedList���� implements List�ӿ�
 * LinkedList���ϵ��ص�:
 * 1.�ײ���һ������ṹ:��ѯ��,��ɾ��
 * 2.��߰����˴���������βԪ�صķ���
 * ע��:ʹ��LinkedList�������еķ���,����ʹ�ö�̬
 * <p>
 * - public void addFirst(E e):��ָ��Ԫ�ز�����б�Ŀ�ͷ��
 * - public void addLast(E e):��ָ��Ԫ����ӵ����б�Ľ�β��
 * - public void push(E e):��Ԫ��������б�����ʾ�Ķ�ջ��
 * <p>
 * - public E getFirst():���ش��б�ĵ�һ��Ԫ�ء�
 * - public E getLast():���ش��б�����һ��Ԫ�ء�
 * <p>
 * - public E removeFirst():�Ƴ������ش��б�ĵ�һ��Ԫ�ء�
 * - public E removeLast():�Ƴ������ش��б�����һ��Ԫ�ء�
 * - public E pop():�Ӵ��б�����ʾ�Ķ�ջ������һ��Ԫ�ء�
 * <p>
 * - public boolean isEmpty()������б�����Ԫ�أ��򷵻�true��
 */
public class LinkedListMain {
    public static void main(String[] args) {
        demo01();
        System.out.println("=================");
        demo02();
        System.out.println("=================");
        demo03();
    }
    /*
     * - public E removeFirst():�Ƴ������ش��б�ĵ�һ��Ԫ�ء�
     * - public E removeLast():�Ƴ������ش��б�����һ��Ԫ�ء�
     * - public E pop():�Ӵ��б�����ʾ�Ķ�ջ������һ��Ԫ�ء�
     */
    private static void demo03() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
        String removeFirst = link.removeFirst();//��ͬ��link.pop();
        System.out.println("���Ƴ��ĵ�һ��Ԫ��"+removeFirst);
        String removeLast = link.removeLast();
        System.out.println("���Ƴ�ǰ�����һ��Ԫ��"+removeLast);
    }

    /*
     * - public E getFirst():���ش��б�ĵ�һ��Ԫ�ء�
     * - public E getLast():���ش��б�����һ��Ԫ�ء�
     */
    private static void demo02() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
//        link.clear();//��ռ����е�����Ԫ��
//        - public boolean isEmpty()������б�����Ԫ�أ��򷵻�true��
        if (link.isEmpty()) {
            String first = link.getFirst();
            String last = link.getLast();
            System.out.println("���ϵ�һ��Ԫ�أ�" + first + "�������һ��Ԫ�أ�" + last);
        }
    }

    /*
     *         - public void addFirst(E e):��ָ��Ԫ�ز�����б�Ŀ�ͷ��
     *         - public void addLast(E e):��ָ��Ԫ����ӵ����б�Ľ�β��
     *         - public void push(E e):��Ԫ��������б�����ʾ�Ķ�ջ����ͬ��addFirst������
     */
    private static void demo01() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
        link.addFirst("Jun");//��Чlink.push("Jun")
        System.out.println(link);
        link.addLast("JUn");
        System.out.println(link);


    }
}
