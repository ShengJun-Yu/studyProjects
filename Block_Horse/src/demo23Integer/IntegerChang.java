package demo23Integer;

/**
 * @author : Bojack
 * @date : Created in 20:40 2021.11.25
 * 基本类型与字符串类型之间的相互转换
 * 基本类型->字符串(String)
 * 1.基本类型的值+""  最简单的方法(工作中常用)
 * 2.包装类的静态方法toString(参数),不是Object类的toString() 重载
 * static String toString(int i) 返回一个表示指定整数的 String 对象。
 * 3.String类的静态方法valueOf(参数)
 * static String valueOf(int i) 返回 int 参数的字符串表示形式。
 * 字符串(String)->基本类型
 * 使用包装类的静态方法parseXXX("字符串");
 * Integer类: static int parseInt(String s)
 * Double类: static double parseDouble(String s)
 */
public class IntegerChang {
    public static void main(String[] args) {
//        基本类型->字符串(String)
//        基本类型的值+""
        String str=1+"";
        System.out.println(str+"添加");
//        装类的静态方法toString(参数)
        String str1 = Integer.toString(1);
        System.out.println(str1+"添加");
//        String类的静态方法valueOf(参数)
        String str2 = String.valueOf(1);
        System.out.println(str1+"添加");
//        字符串(String)->基本类型
        int i = Integer.parseInt("1");
        System.out.println(i+1);

        double v = Double.parseDouble("1.2");
        System.out.println(v+1.3);

    }
}
