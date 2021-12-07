package demo29Map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author : Bojack
 * @date : Created in 19:59 2021.12.07
 * java.util.Hashtable<K,V>���� implements Map<K,V>�ӿ�
 *
 *     Hashtable:�ײ�Ҳ��һ����ϣ��,��һ���̰߳�ȫ�ļ���,�ǵ��̼߳���,�ٶ���
 *     HashMap:�ײ���һ����ϣ��,��һ���̲߳���ȫ�ļ���,�Ƕ��̵߳ļ���,�ٶȿ�
 *
 *     HashMap����(֮ǰѧ�����еļ���):���Դ洢nullֵ,null��
 *     Hashtable����,���ܴ洢nullֵ,null��
 *
 *     Hashtable��Vector����һ��,��jdk1.2�汾֮�󱻸��Ƚ��ļ���(HashMap,ArrayList)ȡ����
 *     Hashtable������Properties��Ȼ��Ծ����ʷ��̨
 *     Properties������һ��Ψһ��IO�����ϵļ���
 */
public class demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,Integer> hashmap=new HashMap<>();
        hashmap.put(null,1);
        hashmap.put("2",null);
        hashmap.put(null,null);
        System.out.println(hashmap);

        Hashtable<String,Integer> hashtable=new Hashtable<>();
        hashtable.put("1",1);
        hashtable.put("2",2);
        hashtable.put("3",3);
        System.out.println(hashtable);
    }
}
