package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Predicate;

/**
 * @author : Bojack
 * @date : Created in 19:23 2022.03.03
 * �߼����ʽ:�������Ӷ���жϵ�����
 * &&:�������,��false��false
 * ||:�������,��true��true
 * !:��(ȡ��)�����,�������,�Ǽ�����
 * ����:�ж�һ���ַ���,�������жϵ�����
 * 1.�ж��ַ����ĳ����Ƿ����5
 * 2.�ж��ַ������Ƿ����a
 * ������������ͬʱ����,���ǾͿ���ʹ��&&�����������������
 * Predicate�ӿ�����һ������and,��ʾ���ҹ�ϵ,Ҳ�����������������ж�����
 * default Predicate<T> and(Predicate<? super T> other) {
 * Objects.requireNonNull(other);
 * return (t) -> this.test(t) && other.test(t);
 * }
 * �����ڲ��������ж�����,Ҳ��ʹ��&&���������������
 */
public class demo03Predicate01 {
    public static boolean judge(String s, Predicate <String> p1,Predicate<String> p2){
//        return p1.test(s)&&p2.test(s);
        /*
            Predicate�ӿ�����һ������negate,Ҳ��ʾȡ������˼
    default Predicate<T> negate() {
        return (t) -> !test(t);
         */
        return  p1.negate().test(s);//��Ч��return !pre.test(s);
    }

    public static void main(String[] args) {
        String s1="wrfwergwe";
        boolean a = judge(s1, (s) -> s.length() > 4, (s) -> s.contains("w"));
        System.out.println(a);
    }
}
