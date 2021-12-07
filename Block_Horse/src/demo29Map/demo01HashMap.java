package demo29Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Bojack
 * @date : Created in 17:31 2021.12.07
 *     java.util.Map<k,v>集合
 *     Map集合的特点:
 *         1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
 *         2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
 *         3.Map集合中的元素,key是不允许重复的,value是可以重复的
 *         4.Map集合中的元素,key和value是一一对应
 *     java.util.HashMap<k,v>集合 implements Map<k,v>接口
 *     HashMap集合的特点:
 *         1.HashMap集合底层是哈希表:查询的速度特别的快
 *             JDK1.8之前:数组+单向链表
 *             JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
 *         2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
 *    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
 *    LinkedHashMap的特点:
 *         1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
 *         2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class demo01HashMap {
    public static void main(String[] args) {
        MethodPut();
        MethodRemove();
        MethodGet();
        MethodContainsKey();
    }
    /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false
     */
    private static void MethodContainsKey() {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        System.out.println("MethodContainKey中HashMap存储的东西："+hashMap);
        boolean jun = hashMap.containsKey("jun");
        System.out.println(jun);
        boolean huhb = hashMap.containsKey("huhb");
        System.out.println(huhb);
    }

    /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
     */
    private static void MethodGet() {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        System.out.println("MethodGet中HashMap存储的东西："+hashMap);
        Integer bojack = hashMap.get("Bojack");
        System.out.println(bojack);
        Integer junnn = hashMap.get("junnn");
        System.out.println(junnn);
    }

    /*
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值:V
                key存在,v返回被删除的值
                key不存在,v返回null
     */
    private static void MethodRemove() {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        System.out.println("MethodRemove中HashMap存储的东西："+hashMap);
        Integer jun = hashMap.remove("jun");
        System.out.println(jun);
        Integer junm = hashMap.remove("junm");
        System.out.println(junm);

    }


    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候,key不重复,返回值V是null
                存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
     */
    private static void MethodPut() {
        //多态
        Map<String,String> hashMap=new HashMap<>();
        String s = hashMap.put("Bojack", "18");
        System.out.println(s);//返回值V是null
        String s1 = hashMap.put("Bojack", "19");
        System.out.println(s1);//返回被替换的value值
        String s2 = hashMap.put("Bojack", "19");
        String s3= hashMap.put("jun", "10");
        String s4 = hashMap.put("cheng", "11");
        System.out.println("MethodPut中HashMap存储的东西："+hashMap);

    }
}
