package demo29Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author : Bojack
 * @date : Created in 19:45 2021.12.07
 * java.util.LinkedHashMap<K,V> entends HashMap<K,V>
 * Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 * 底层原理:
 * 哈希表+链表(记录元素的顺序)
 */
public class linkedHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("1", 1);
        hashMap.put("3", 3);
        hashMap.put("2", 2);
        hashMap.put("1", 4);
        System.out.println(hashMap);


        HashMap<String, Integer> linkedhashMap = new LinkedHashMap<>();
        linkedhashMap.put("1", 1);
        linkedhashMap.put("3", 3);
        linkedhashMap.put("2", 2);
        linkedhashMap.put("1", 4);
        System.out.println(linkedhashMap);
    }
}
