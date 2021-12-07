package demo29Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 18:47 2021.12.07
 *     Map集合遍历的第二种方式:使用Entry对象遍历
 *
 *     Map集合中的方法:
 *         Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。
 *
 *     实现步骤:
 *         1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
 *         2.遍历Set集合,获取每一个Entry对象
 *         3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class HashMapEntry {
    public static void main(String[] args) {

        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
//        使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<String, Integer>> entryset = hashMap.entrySet();
        //增强for
        for (Map.Entry<String, Integer> s: entryset) {
            String key = s.getKey();
            Integer value = s.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("======================");
        //迭代器
        Iterator<Map.Entry<String, Integer>> iterator = entryset.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"="+value);
        }
    }
}
