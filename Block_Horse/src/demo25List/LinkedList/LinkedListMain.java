package demo25List.LinkedList;

import java.util.LinkedList;

/**
 * @author : Bojack
 * @date : Created in 18:11 2021.12.01
 * java.util.LinkedList集合 implements List接口
 * LinkedList集合的特点:
 * 1.底层是一个链表结构:查询慢,增删快
 * 2.里边包含了大量操作首尾元素的方法
 * 注意:使用LinkedList集合特有的方法,不能使用多态
 * <p>
 * - public void addFirst(E e):将指定元素插入此列表的开头。
 * - public void addLast(E e):将指定元素添加到此列表的结尾。
 * - public void push(E e):将元素推入此列表所表示的堆栈。
 * <p>
 * - public E getFirst():返回此列表的第一个元素。
 * - public E getLast():返回此列表的最后一个元素。
 * <p>
 * - public E removeFirst():移除并返回此列表的第一个元素。
 * - public E removeLast():移除并返回此列表的最后一个元素。
 * - public E pop():从此列表所表示的堆栈处弹出一个元素。
 * <p>
 * - public boolean isEmpty()：如果列表不包含元素，则返回true。
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
     * - public E removeFirst():移除并返回此列表的第一个元素。
     * - public E removeLast():移除并返回此列表的最后一个元素。
     * - public E pop():从此列表所表示的堆栈处弹出一个元素。
     */
    private static void demo03() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
        String removeFirst = link.removeFirst();//等同于link.pop();
        System.out.println("被移除的第一个元素"+removeFirst);
        String removeLast = link.removeLast();
        System.out.println("被移除前的最后一个元素"+removeLast);
    }

    /*
     * - public E getFirst():返回此列表的第一个元素。
     * - public E getLast():返回此列表的最后一个元素。
     */
    private static void demo02() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
//        link.clear();//清空集合中的所有元素
//        - public boolean isEmpty()：如果列表不包含元素，则返回true。
        if (link.isEmpty()) {
            String first = link.getFirst();
            String last = link.getLast();
            System.out.println("集合第一个元素：" + first + "集合最后一个元素：" + last);
        }
    }

    /*
     *         - public void addFirst(E e):将指定元素插入此列表的开头。
     *         - public void addLast(E e):将指定元素添加到此列表的结尾。
     *         - public void push(E e):将元素推入此列表所表示的堆栈。等同于addFirst（）；
     */
    private static void demo01() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
        link.addFirst("Jun");//等效link.push("Jun")
        System.out.println(link);
        link.addLast("JUn");
        System.out.println(link);


    }
}
