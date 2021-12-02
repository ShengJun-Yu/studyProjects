package demo28Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Bojack
 * @date : Created in 20:55 2021.12.02
 *     - java.utils.Collections�Ǽ��Ϲ����࣬�����Լ��Ͻ��в��������ַ������£�
 *         - public static <T> boolean addAll(Collection<T> c, T... elements):�����������һЩԪ�ء�
 *         - public static void shuffle(List<?> list) ����˳��:���Ҽ���˳��
 *            public static <T> void sort(List<T> list):��������Ԫ�ذ���Ĭ�Ϲ�������
 */
public class Add_Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        - public static <T> boolean addAll(Collection<T> c, T... elements):�����������һЩԪ�ء�
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        System.out.println(list);
//        public static void shuffle(List<?> list) ����˳��:���Ҽ���˳��
        Collections.shuffle(list);
        System.out.println(list);
//        public static <T> void sort(List<T> list):��������Ԫ�ذ���Ĭ�Ϲ�������
        Collections.sort(list);
        System.out.println(list);
    }
}
