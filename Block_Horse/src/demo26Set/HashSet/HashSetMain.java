package demo26Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author : Bojack
 * @date : Created in 19:04 2021.12.01
 *    java.util.Set�ӿ� extends Collection�ӿ�
 *     Set�ӿڵ��ص�:
 *         1.������洢�ظ���Ԫ��
 *         2.û������,û�д������ķ���,Ҳ����ʹ����ͨ��forѭ������
 *     java.util.HashSet���� implements Set�ӿ�
 *     HashSet�ص�:
 *          1.������洢�ظ���Ԫ��
 *          2.û������,û�д������ķ���,Ҳ����ʹ����ͨ��forѭ������
 *          3.��һ������ļ���,�洢Ԫ�غ�ȡ��Ԫ�ص�˳���п��ܲ�һ��
 *          4.�ײ���һ����ϣ��ṹ(��ѯ���ٶȷǳ��Ŀ�)
 */
public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("c");
        set.add("b");
        set.add("a");
        System.out.println(set);
//        ������ʹ�õ�����������ǿfor����
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("++++++++++++++++++++=");
        for (String s: set) {
            System.out.println(s);
        }
    }
}
