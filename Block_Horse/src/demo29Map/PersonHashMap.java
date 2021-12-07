package demo29Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 19:15 2021.12.07
 *     HashMap存储自定义类型键值
 *     Map集合保证key是唯一的:
 *         作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 */
public class PersonHashMap {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复
     */
    private static void demo02() {
        Map<Person,String> map=new HashMap<>();
        map.put(new Person("余盛军",23),"赣州");
        map.put(new Person("cetew",22),"南昌");
        map.put(new Person("Bojak",20),"上饶");
        map.put(new Person("余盛军",23),"宜春");
        Set<Person> p = map.keySet();
        for (Person s:
             p) {
            String s1 = map.get(s);
            System.out.println(s+"="+s1);
        }

    }

    /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            value可以重复(同名同年龄的人视为同一个)
     */
    private static void demo01() {
        Map<String,Person> map=new HashMap<>();
        map.put("赣州",new Person("余盛军",23));
        map.put("南昌",new Person("cete",22));
        map.put("上饶",new Person("Bojakc",20));
        map.put("宜春",new Person("Jun",23));
//        System.out.println(map);
        Set<String> set = map.keySet();
//        for (String s: set) {
//            Person p = map.get(s);
//            System.out.println(s+"="+p);
//        }
//        System.out.println("==========");
        //迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            Person p = map.get(next);
            System.out.println(next+"="+p);
        }
        System.out.println("=======================");
    }


    }


