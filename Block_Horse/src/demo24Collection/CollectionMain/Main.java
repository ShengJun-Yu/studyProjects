package demo24Collection.CollectionMain;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author : Bojack
 * @date : Created in 15:50 2021.11.30
 *     java.util.Collection接口
 *         所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
 *         任意的单列集合都可以使用Collection接口中的方法
 *
 *
 *     共性的方法:
 *       public boolean add(E e)：  把给定的对象添加到当前集合中 。
 *       public void clear() :清空集合中所有的元素。
 *       public boolean remove(E e): 把给定的对象在当前集合中删除。
 *       public boolean contains(E e): 判断当前集合中是否包含给定的对象。
 *       public boolean isEmpty(): 判断当前集合是否为空。
 *       public int size(): 返回集合中元素的个数。
 *       public Object[] toArray(): 把集合中的元素，存储到数组中
 */
public class Main {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
//        public boolean add(E e)：  把给定的对象添加到当前集合中 。
        col.add("Bojack");
        col.add("Cete");
        col.add("Roilly");
        col.add("Roilly");
        col.add("End");
        System.out.println(col.toString());
//        public boolean remove(E e): 把给定的对象在当前集合中删除。
        boolean remove = col.remove("Cete");
        System.out.println(remove);//删除是否成功
        System.out.println("删除后"+col.toString());
//        public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        boolean b = col.contains("Bojack");
        System.out.println("是否有Bojack这个元素"+b);
//        public boolean isEmpty(): 判断当前集合是否为空。
        boolean y = col.isEmpty();
        System.out.println("col这个集合是否为空"+b);
//        public int size(): 返回集合中元素的个数。
        int size = col.size();
        System.out.println("col这个集合元素个数有多少"+size);
//        public Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] Array = col.toArray();
        System.out.println("col这个集合元素储存到Array这个数组中");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
//        public void clear() :清空集合中所有的元素。
        col.clear();
        System.out.println("清除后"+col.toString());

    }
}
