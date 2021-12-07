package demo29Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 18:47 2021.12.07
 *     Map���ϱ����ĵڶ��ַ�ʽ:ʹ��Entry�������
 *
 *     Map�����еķ���:
 *         Set<Map.Entry<K,V>> entrySet() ���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
 *
 *     ʵ�ֲ���:
 *         1.ʹ��Map�����еķ���entrySet(),��Map�����ж��Entry����ȡ����,�洢��һ��Set������
 *         2.����Set����,��ȡÿһ��Entry����
 *         3.ʹ��Entry�����еķ���getKey()��getValue()��ȡ����ֵ
 */
public class HashMapEntry {
    public static void main(String[] args) {

        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
//        ʹ��Map�����еķ���entrySet(),��Map�����ж��Entry����ȡ����,�洢��һ��Set������
        Set<Map.Entry<String, Integer>> entryset = hashMap.entrySet();
        //��ǿfor
        for (Map.Entry<String, Integer> s: entryset) {
            String key = s.getKey();
            Integer value = s.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("======================");
        //������
        Iterator<Map.Entry<String, Integer>> iterator = entryset.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"="+value);
        }
    }
}
