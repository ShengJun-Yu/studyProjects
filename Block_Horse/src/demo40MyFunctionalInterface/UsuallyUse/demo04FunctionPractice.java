package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Function;

/**
 * @author : Bojack
 * @date : Created in 20:52 2022.03.03
 * 练习：自定义函数模型拼接
 * 题目
 * 请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
 * String str = "赵丽颖,20";
 * <p>
 * 分析:
 * 1. 将字符串截取数字年龄部分，得到字符串；
 * Function<String,String> "赵丽颖,20"->"20"
 * 2. 将上一步的字符串转换成为int类型的数字；
 * Function<String,Integer> "20"->20
 * 3. 将上一步的int数字累加100，得到结果int数字。
 * Function<Integer,Integer> 20->120
 */
public class demo04FunctionPractice {
    public static int method(String s, Function<String, String> f1, Function<String, Integer> f2, Function<Integer, Integer> f3) {
        int apply = f1.andThen(f2).andThen(f3).apply(s);
        return apply;
    }

    public static void main(String[] args) {
        String n = "余盛军,11";
        int apply = method(n, (s) -> s.split(",")[1], (s) -> Integer.parseInt(s), (s) -> s + 100);
        System.out.println(apply);
    }
}

