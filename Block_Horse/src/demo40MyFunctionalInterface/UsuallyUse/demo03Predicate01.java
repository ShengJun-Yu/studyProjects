package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Predicate;

/**
 * @author : Bojack
 * @date : Created in 19:23 2022.03.03
 * 逻辑表达式:可以连接多个判断的条件
 * &&:与运算符,有false则false
 * ||:或运算符,有true则true
 * !:非(取反)运算符,非真则假,非假则真
 * 需求:判断一个字符串,有两个判断的条件
 * 1.判断字符串的长度是否大于5
 * 2.判断字符串中是否包含a
 * 两个条件必须同时满足,我们就可以使用&&运算符连接两个条件
 * Predicate接口中有一个方法and,表示并且关系,也可以用于连接两个判断条件
 * default Predicate<T> and(Predicate<? super T> other) {
 * Objects.requireNonNull(other);
 * return (t) -> this.test(t) && other.test(t);
 * }
 * 方法内部的两个判断条件,也是使用&&运算符连接起来的
 */
public class demo03Predicate01 {
    public static boolean judge(String s, Predicate <String> p1,Predicate<String> p2){
//        return p1.test(s)&&p2.test(s);
        /*
            Predicate接口中有一个方法negate,也表示取反的意思
    default Predicate<T> negate() {
        return (t) -> !test(t);
         */
        return  p1.negate().test(s);//等效于return !pre.test(s);
    }

    public static void main(String[] args) {
        String s1="wrfwergwe";
        boolean a = judge(s1, (s) -> s.length() > 4, (s) -> s.contains("w"));
        System.out.println(a);
    }
}
