package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Predicate;

/**
 * @author : Bojack
 * @date : Created in 19:05 2022.03.03
 * java.util.function.Predicate<T>�ӿ�
 * ����:��ĳ���������͵����ݽ����ж�,�������һ��booleanֵ
 * <p>
 * Predicate�ӿ��а���һ�����󷽷���
 * boolean test(T t):������ָ�������������ݽ����жϵķ���
 * ���:
 * ��������,����true
 * ����������,����false
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
