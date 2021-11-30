package demo24Collection.CollectionMain;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author : Bojack
 * @date : Created in 15:50 2021.11.30
 *     java.util.Collection�ӿ�
 *         ���е��м��ϵ����Ľӿ�,��߶��������е��м��Ϲ��Եķ���
 *         ����ĵ��м��϶�����ʹ��Collection�ӿ��еķ���
 *
 *
 *     ���Եķ���:
 *       public boolean add(E e)��  �Ѹ����Ķ�����ӵ���ǰ������ ��
 *       public void clear() :��ռ��������е�Ԫ�ء�
 *       public boolean remove(E e): �Ѹ����Ķ����ڵ�ǰ������ɾ����
 *       public boolean contains(E e): �жϵ�ǰ�������Ƿ���������Ķ���
 *       public boolean isEmpty(): �жϵ�ǰ�����Ƿ�Ϊ�ա�
 *       public int size(): ���ؼ�����Ԫ�صĸ�����
 *       public Object[] toArray(): �Ѽ����е�Ԫ�أ��洢��������
 */
public class Main {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
//        public boolean add(E e)��  �Ѹ����Ķ�����ӵ���ǰ������ ��
        col.add("Bojack");
        col.add("Cete");
        col.add("Roilly");
        col.add("Roilly");
        col.add("End");
        System.out.println(col.toString());
//        public boolean remove(E e): �Ѹ����Ķ����ڵ�ǰ������ɾ����
        boolean remove = col.remove("Cete");
        System.out.println(remove);//ɾ���Ƿ�ɹ�
        System.out.println("ɾ����"+col.toString());
//        public boolean contains(E e): �жϵ�ǰ�������Ƿ���������Ķ���
        boolean b = col.contains("Bojack");
        System.out.println("�Ƿ���Bojack���Ԫ��"+b);
//        public boolean isEmpty(): �жϵ�ǰ�����Ƿ�Ϊ�ա�
        boolean y = col.isEmpty();
        System.out.println("col��������Ƿ�Ϊ��"+b);
//        public int size(): ���ؼ�����Ԫ�صĸ�����
        int size = col.size();
        System.out.println("col�������Ԫ�ظ����ж���"+size);
//        public Object[] toArray(): �Ѽ����е�Ԫ�أ��洢��������
        Object[] Array = col.toArray();
        System.out.println("col�������Ԫ�ش��浽Array���������");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
//        public void clear() :��ռ��������е�Ԫ�ء�
        col.clear();
        System.out.println("�����"+col.toString());

    }
}
