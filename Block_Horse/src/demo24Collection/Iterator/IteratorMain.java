package demo24Collection.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 19:37 2021.11.30
 *     java.util.Iterator接口:迭代器(对集合进行遍历)
 *     有两个常用的方法
 *         boolean hasNext() 如果仍有元素可以迭代，则返回 true。
 *             判断集合中还有没有下一个元素,有就返回true,没有就返回false
 *         E next() 返回迭代的下一个元素。
 *             取出集合中的下一个元素
 *     Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
 *     Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
 *         Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。
 *
 *     迭代器的使用步骤(重点):
 *         1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
 *         2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
 *         3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class IteratorMain {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("Bojack");
        col.add("Cete");
        col.add("Roilly");
        col.add("Roilly");
        col.add("End");
// 多态：      接口                实现类
        Iterator<String> it = col.iterator();
        while(it.hasNext()){
            String n = it.next();
            System.out.println(n);
        }
        System.out.println("==========================");
        for (Iterator<String> s= col.iterator();s.hasNext();){
            String ne = s.next();
            System.out.println(ne);
        }


    }
}
