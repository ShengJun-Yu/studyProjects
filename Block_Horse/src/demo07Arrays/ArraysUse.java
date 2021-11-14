package demo07Arrays;
import java.util.Arrays;
/**
 * @author : Bojack
 * @date : 2021年10月25日19:38:12
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。
 *
 * public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1, 元素2, 元素3...]）
 * public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。
 *
 * 备注：
 * 1. 如果是数值，sort默认按照升序从小到大
 * 2. 如果是字符串，sort默认按照字母升序
 * 3. 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。（今后学习）
 */
public class ArraysUse {
    public static void main(String[] args) {
        int[] array1={23,56,34,321,12,112};
        String str=Arrays.toString(array1);
        System.out.println(str);
        // public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] str1={"zaaaqqq","acwrew","abfsesf"};
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));

    }
}
