package demo28Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Bojack
 * @date : Created in 21:13 2021.12.02
 *     - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
 *         public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
 *     注意:
 *          sort(List<T> list)使用前提
 *          被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则
 *
 *     Comparable接口的排序规则:
 *         自己(this)-参数:升序
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
