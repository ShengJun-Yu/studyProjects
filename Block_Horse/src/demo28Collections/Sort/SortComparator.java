package demo28Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author : Bojack
 * @date : Created in 21:34 2021.12.02
 *  - java.utils.Collections�Ǽ��Ϲ����࣬�����Լ��Ͻ��в��������ַ������£�
 *         public static <T> void sort(List<T> list��Comparator<? super T> ):��������Ԫ�ذ���ָ����������
 *
 *      Comparator��Comparable������
 *         Comparable:�Լ�(this)�ͱ���(����)�Ƚ�,�Լ���Ҫʵ��Comparable�ӿ�,��д�ȽϵĹ���compareTo����
 *         Comparator:�൱����һ���������Ĳ���,�Ƚ�����
 *
 *     Comparator���������:
 *         o1-o2:��С����ǰ
 *         o2-o1:��������ǰ
 */
public class SortComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
        Student p1= new Student("Jun",18);
        Student p2= new Student("Sheng",14);
        Student p3= new Student("Yu",16);
        ArrayList<Student> list1 = new ArrayList<>();
        Collections.addAll(list1,p1,p2,p3);
        System.out.println(list1);
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list1);
    }
}
