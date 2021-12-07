package demo29Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 18:18 2021.12.07
 *     Map���ϵĵ�һ�ֱ�����ʽ:ͨ������ֵ�ķ�ʽ
 *     Map�����еķ���:
 *          Set<K> keySet() ���ش�ӳ���а����ļ��� Set ��ͼ��
 *     ʵ�ֲ���:
 *         1.ʹ��Map�����еķ���keySet(),��Map�������е�keyȡ����,�洢��һ��Set������
 *         2.����set����,��ȡMap�����е�ÿһ��key
 *         3.ͨ��Map�����еķ���get(key),ͨ��key�ҵ�value
 */
public class HashMapkeySet {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        //ʹ��Map�����еķ���keySet(),��Map�������е�keyȡ����,�洢��һ��Set������
        Set<String> set = hashMap.keySet();
        //��ǿFor
        for (String s: set) {
            Integer ints = hashMap.get(s);
            System.out.println(s+"="+ints);
        }
        System.out.println("===============");
        //������
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            //ͨ��Map�����еķ���get(key),ͨ��key�ҵ�value
            Integer integer = hashMap.get(next);
            System.out.println(next+"="+integer);
        }
    }
}
