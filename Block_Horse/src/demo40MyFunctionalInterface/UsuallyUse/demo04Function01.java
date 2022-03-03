package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Function;

/**
 * @author : Bojack
 * @date : Created in 20:43 2022.03.03
 * Function接口中的默认方法andThen:用来进行组合操作
 * <p>
 * 需求:
 * 把String类型的"123",转换为Inteter类型,把转换后的结果加10
 * 把增加之后的Integer类型的数据,转换为String类型
 * <p>
 * 分析:
 * 转换了两次
 * 第一次是把String类型转换为了Integer类型
 * 所以我们可以使用Function<String,Integer> fun1
 * Integer i = fun1.apply("123")+10;
 * 第二次是把Integer类型转换为String类型
 * 所以我们可以使用Function<Integer,String> fun2
 * String s = fun2.apply(i);
 * 我们可以使用andThen方法,把两次转换组合在一起使用
 * String s = fun1.andThen(fun2).apply("123");
 * fun1先调用apply方法,把字符串转换为Integer
 * fun2再调用apply方法,把Integer转换为字符串
 */
public class demo04Function01 {
    public static void andthen(String s, Function<String,Integer> f1,Function<Integer,String> f2){
//        Integer apply = f.apply(s)+10;
//        String apply1 = f1.apply(apply);
        String ss=f1.andThen(f2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s="112";
        andthen(s,(i)->Integer.parseInt(i)+10,(i)->String.valueOf(i));
    }
}
