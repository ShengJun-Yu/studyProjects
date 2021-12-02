package demo28Collections.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author : Bojack
 * @date : Created in 21:34 2021.12.02
 *  - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
 *         public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。
 *
 *      Comparator和Comparable的区别
 *         Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
 *         Comparator:相当于找一个第三方的裁判,比较两个
 *
 *     Comparator的排序规则:
 *         o1-o2:更小数在前
 *         o2-o1:更大数在前
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
