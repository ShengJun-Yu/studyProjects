package demo29Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 18:18 2021.12.07
 *     Map集合的第一种遍历方式:通过键找值的方式
 *     Map集合中的方法:
 *          Set<K> keySet() 返回此映射中包含的键的 Set 视图。
 *     实现步骤:
 *         1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
 *         2.遍历set集合,获取Map集合中的每一个key
 *         3.通过Map集合中的方法get(key),通过key找到value
 */
public class HashMapkeySet {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        //使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        Set<String> set = hashMap.keySet();
        //增强For
        for (String s: set) {
            Integer ints = hashMap.get(s);
            System.out.println(s+"="+ints);
        }
        System.out.println("===============");
        //迭代器
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            //通过Map集合中的方法get(key),通过key找到value
            Integer integer = hashMap.get(next);
            System.out.println(next+"="+integer);
        }
    }
}
