package demo28Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Bojack
 * @date : Created in 20:55 2021.12.02
 *     - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
 *         - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
 *         - public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
 *            public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
 */
public class Add_Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        - public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        System.out.println(list);
//        public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);
//        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        Collections.sort(list);
        System.out.println(list);
    }
}
