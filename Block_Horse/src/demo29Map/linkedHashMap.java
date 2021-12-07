package demo29Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author : Bojack
 * @date : Created in 19:45 2021.12.07
 * java.util.LinkedHashMap<K,V> entends HashMap<K,V>
 * Map �ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
 * �ײ�ԭ��:
 * ��ϣ��+����(��¼Ԫ�ص�˳��)
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
