package demo08Math;

/**
 * @author : Bojack
 * @date : 2021年10月25日20:42:22
 * java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。
 *
 * public static double abs(double num)：获取绝对值。有多种重载。
 * public static double ceil(double num)：向上取整。
 * public static double floor(double num)：向下取整。
 * public static long round(double num)：四舍五入。
 *
 * Math.PI代表近似的圆周率常量（double）。
 */
public class math01 {
    public static void main(String[] args) {
        //public static double abs(double num)：获取绝对值。有多种重载。
        System.out.println(Math.abs(-1232));
        //public static double ceil(double num)：向上取整。
        System.out.println(Math.ceil(45.32));
        //public static double floor(double num)：向下取整
        System.out.println(Math.floor(45.32));
        // public static long round(double num)：四舍五入。
        System.out.println(Math.round(45.32));
        System.out.println(Math.round(45.52));

        //Math.PI代表近似的圆周率常量（double）。
        System.out.println(Math.PI);


    }
}
