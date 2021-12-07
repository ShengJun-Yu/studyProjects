package demo29Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Bojack
 * @date : Created in 17:31 2021.12.07
 *     java.util.Map<k,v>����
 *     Map���ϵ��ص�:
 *         1.Map������һ��˫�м���,һ��Ԫ�ذ�������ֵ(һ��key,һ��value)
 *         2.Map�����е�Ԫ��,key��value���������Ϳ�����ͬ,Ҳ���Բ�ͬ
 *         3.Map�����е�Ԫ��,key�ǲ������ظ���,value�ǿ����ظ���
 *         4.Map�����е�Ԫ��,key��value��һһ��Ӧ
 *     java.util.HashMap<k,v>���� implements Map<k,v>�ӿ�
 *     HashMap���ϵ��ص�:
 *         1.HashMap���ϵײ��ǹ�ϣ��:��ѯ���ٶ��ر�Ŀ�
 *             JDK1.8֮ǰ:����+��������
 *             JDK1.8֮��:����+��������|�����(����ĳ��ȳ���8):��߲�ѯ���ٶ�
 *         2.hashMap������һ������ļ���,�洢Ԫ�غ�ȡ��Ԫ�ص�˳���п��ܲ�һ��
 *    java.util.LinkedHashMap<k,v>���� extends HashMap<k,v>����
 *    LinkedHashMap���ص�:
 *         1.LinkedHashMap���ϵײ��ǹ�ϣ��+����(��֤������˳��)
 *         2.LinkedHashMap������һ������ļ���,�洢Ԫ�غ�ȡ��Ԫ�ص�˳����һ�µ�
 */
public class demo01HashMap {
    public static void main(String[] args) {
        MethodPut();
        MethodRemove();
        MethodGet();
        MethodContainsKey();
    }
    /*
        boolean containsKey(Object key) �жϼ������Ƿ����ָ���ļ���
        ��������true,����������false
     */
    private static void MethodContainsKey() {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        System.out.println("MethodContainKey��HashMap�洢�Ķ�����"+hashMap);
        boolean jun = hashMap.containsKey("jun");
        System.out.println(jun);
        boolean huhb = hashMap.containsKey("huhb");
        System.out.println(huhb);
    }

    /*
        public V get(Object key) ����ָ���ļ�����Map�����л�ȡ��Ӧ��ֵ��
            ����ֵ:
                key����,���ض�Ӧ��valueֵ
                key������,����null
     */
    private static void MethodGet() {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        System.out.println("MethodGet��HashMap�洢�Ķ�����"+hashMap);
        Integer bojack = hashMap.get("Bojack");
        System.out.println(bojack);
        Integer junnn = hashMap.get("junnn");
        System.out.println(junnn);
    }

    /*
        public V remove(Object key): ��ָ���ļ� ����Ӧ�ļ�ֵ��Ԫ�� ��Map������ɾ�������ر�ɾ��Ԫ�ص�ֵ��
            ����ֵ:V
                key����,v���ر�ɾ����ֵ
                key������,v����null
     */
    private static void MethodRemove() {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Bojack", 1);
        hashMap.put("jun", 2);
        hashMap.put("cheng", 3);
        System.out.println("MethodRemove��HashMap�洢�Ķ�����"+hashMap);
        Integer jun = hashMap.remove("jun");
        System.out.println(jun);
        Integer junm = hashMap.remove("junm");
        System.out.println(junm);

    }


    /*
        public V put(K key, V value):  ��ָ���ļ���ָ����ֵ��ӵ�Map�����С�
            ����ֵ:v
                �洢��ֵ�Ե�ʱ��,key���ظ�,����ֵV��null
                �洢��ֵ�Ե�ʱ��,key�ظ�,��ʹ���µ�value�滻map���ظ���value,���ر��滻��valueֵ
     */
    private static void MethodPut() {
        //��̬
        Map<String,String> hashMap=new HashMap<>();
        String s = hashMap.put("Bojack", "18");
        System.out.println(s);//����ֵV��null
        String s1 = hashMap.put("Bojack", "19");
        System.out.println(s1);//���ر��滻��valueֵ
        String s2 = hashMap.put("Bojack", "19");
        String s3= hashMap.put("jun", "10");
        String s4 = hashMap.put("cheng", "11");
        System.out.println("MethodPut��HashMap�洢�Ķ�����"+hashMap);

    }
}
