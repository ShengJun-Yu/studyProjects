package demo26Set.HashSet;

import java.util.HashSet;

/**
 * @author : Bojack
 * @date : Created in 20:57 2021.12.01
 *     HashSet存储自定义类型元素
 *
 *     set集合保证元素唯一:
 *         存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法
 *
 *     要求:
 *         同名同年龄的人,视为同一个人,只能存储一次
 */
public class HashSetMyself {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p = new Person("Bojack",18);
        Person p1 = new Person("Bojack",18);
        Person p2 = new Person("Jack",19);
        set.add(p);
        set.add(p1);
        set.add(p2);
        System.out.println(set);
    }
}
