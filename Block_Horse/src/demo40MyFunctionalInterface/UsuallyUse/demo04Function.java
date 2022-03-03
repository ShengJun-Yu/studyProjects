package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Function;

/**
 * @author : Bojack
 * @date : Created in 20:37 2022.03.03
 * java.util.function.Function<T,R>�ӿ���������һ�����͵����ݵõ���һ�����͵����ݣ�
 *         ǰ�߳�Ϊǰ�����������߳�Ϊ����������
 *     Function�ӿ�������Ҫ�ĳ��󷽷�Ϊ��R apply(T t)����������T�Ĳ�����ȡ����R�Ľ����
 *         ʹ�õĳ������磺��String����ת��ΪInteger���͡�
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
