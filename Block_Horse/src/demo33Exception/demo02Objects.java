package demo33Exception;

import java.util.Objects;

/**
 * @author : Bojack
 * @date : Created in 19:12 2021.12.08
 *     Obects类中的静态方法
 *     public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
 *     源码:
 *         public static <T> T requireNonNull(T obj) {
 *             if (obj == null)
 *                 throw new NullPointerException();
 *             return obj;
 *         }
 */
public class demo02Objects {
    public static void main(String[] args) {
        demo(null);
    }

    private static void demo(Object obj) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递参数为空");
    }
}
