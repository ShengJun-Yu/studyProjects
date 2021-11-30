package demo24Collection.StrongFor;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 19:58 2021.11.30
 * 增强for循环:底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
 * 是JDK1.5之后出现的新特性
 * Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
 * public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。
 * <p>
 * 增强for循环:用来遍历集合和数组
 * <p>
 * 格式:
 * for(集合/数组的数据类型 变量名: 集合名/数组名){
 * sout(变量名);
 * }
 */
public class Foreach {
    public static void main(String[] args) {
        demo01();
        System.out.println();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bojack");
        list.add("Cete");
        list.add("Roilly");
        list.add("Roilly");
        list.add("End");
        for (String s : list) {
            System.out.print(s + ".");
        }
    }

    private static void demo01() {
        int[] array = {123, 4535, 354, 67, 57, 65, 31, 32, 3, 13, 12, 3, 31, 3};
        for (int i : array) {
            System.out.print(i + ".");
        }
    }
}
