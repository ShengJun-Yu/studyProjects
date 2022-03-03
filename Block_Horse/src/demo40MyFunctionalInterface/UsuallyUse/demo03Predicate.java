package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Predicate;

/**
 * @author : Bojack
 * @date : Created in 19:05 2022.03.03
 * java.util.function.Predicate<T>接口
 * 作用:对某种数据类型的数据进行判断,结果返回一个boolean值
 * <p>
 * Predicate接口中包含一个抽象方法：
 * boolean test(T t):用来对指定数据类型数据进行判断的方法
 * 结果:
 * 符合条件,返回true
 * 不符合条件,返回false
 */
public class demo03Predicate {
    public static boolean Test(String s, Predicate<String> p) {
        return p.test(s);
    }

    public static void main(String[] args) {
        String s = "aa";

        boolean test = Test(s, (s1) -> s1.length() > 3);
        System.out.println(test);
    }
}
