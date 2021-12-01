package demo26Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 19:04 2021.12.01
 *    java.util.Set接口 extends Collection接口
 *     Set接口的特点:
 *         1.不允许存储重复的元素
 *         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 *     java.util.HashSet集合 implements Set接口
 *     HashSet特点:
 *          1.不允许存储重复的元素
 *          2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 *          3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
 *          4.底层是一个哈希表结构(查询的速度非常的快)
 */
public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("c");
        set.add("b");
        set.add("a");
        System.out.println(set);
//        无索引使用迭代器或者增强for遍历
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("++++++++++++++++++++=");
        for (String s: set) {
            System.out.println(s);
        }
    }
}
