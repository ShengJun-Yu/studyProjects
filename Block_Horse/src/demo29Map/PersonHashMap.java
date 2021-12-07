package demo29Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : Bojack
 * @date : Created in 19:15 2021.12.07
 *     HashMap�洢�Զ������ͼ�ֵ
 *     Map���ϱ�֤key��Ψһ��:
 *         ��Ϊkey��Ԫ��,������дhashCode������equals����,�Ա�֤keyΨһ
 */
public class PersonHashMap {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
        HashMap�洢�Զ������ͼ�ֵ
        key:Person����
            Person��ͱ�����дhashCode������equals����,�Ա�֤keyΨһ
        value:String����
            �����ظ�
     */
    private static void demo02() {
        Map<Person,String> map=new HashMap<>();
        map.put(new Person("��ʢ��",23),"����");
        map.put(new Person("cetew",22),"�ϲ�");
        map.put(new Person("Bojak",20),"����");
        map.put(new Person("��ʢ��",23),"�˴�");
        Set<Person> p = map.keySet();
        for (Person s:
             p) {
            String s1 = map.get(s);
            System.out.println(s+"="+s1);
        }

    }

    /*
        HashMap�洢�Զ������ͼ�ֵ
        key:String����
            String����дhashCode������equals����,���Ա�֤keyΨһ
        value:Person����
            value�����ظ�(ͬ��ͬ���������Ϊͬһ��)
     */
    private static void demo01() {
        Map<String,Person> map=new HashMap<>();
        map.put("����",new Person("��ʢ��",23));
        map.put("�ϲ�",new Person("cete",22));
        map.put("����",new Person("Bojakc",20));
        map.put("�˴�",new Person("Jun",23));
//        System.out.println(map);
        Set<String> set = map.keySet();
//        for (String s: set) {
//            Person p = map.get(s);
//            System.out.println(s+"="+p);
//        }
//        System.out.println("==========");
        //������
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            Person p = map.get(next);
            System.out.println(next+"="+p);
        }
        System.out.println("=======================");
    }


    }


