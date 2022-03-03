package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Function;

/**
 * @author : Bojack
 * @date : Created in 20:37 2022.03.03
 * java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
 *         前者称为前置条件，后者称为后置条件。
 *     Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
 *         使用的场景例如：将String类型转换为Integer类型。
 */
public class demo04Function {
    public static void chang(String s, Function<String,Integer> f){
        Integer apply = f.apply(s);
        System.out.println(apply);
    }

    public static void main(String[] args) {
        String f="1122";
        chang(f,(s)->Integer.parseInt(s));
    }
}
