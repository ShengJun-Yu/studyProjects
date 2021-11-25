package demo21System;


import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * @author : Bojack
 * @date : Created in 21:38 2021.11.23
 * java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
 *     public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
 *     public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
 * 将数组中指定的数据拷贝到另一个数组中。
 */
public class System01 {
    public static void main(String[] args) {
        demoCurrentTimeMillis();
        demoarraycopy();
    }

    /*
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
        将数组中指定的数据拷贝到另一个数组中。
        参数:
            src - 源数组。
            srcPos - 源数组中的起始位置(起始索引)。
            dest - 目标数组。
            destPos - 目标数据中的起始位置。
            length - 要复制的数组元素的数量。
        练习:
            将src数组中前3个元素，复制到dest数组的前3个位置上
                复制元素前：
                src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
                复制元素后：
                src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */
    private static void demoarraycopy() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));

    }

    /*
            public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
            用来测试程序的效率
            验证for循环打印数字1-9999所需要使用的时间（毫秒）
     */
    private static void demoCurrentTimeMillis() {
        long b = System.currentTimeMillis();
        SimpleDateFormat c = new SimpleDateFormat();
        String format = c.format(b);
        System.out.println(format);

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println(e);
        System.out.println("用时" + (e - b));
    }
}
