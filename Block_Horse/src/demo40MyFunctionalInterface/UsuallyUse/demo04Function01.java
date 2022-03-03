package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Function;

/**
 * @author : Bojack
 * @date : Created in 20:43 2022.03.03
 * Function�ӿ��е�Ĭ�Ϸ���andThen:����������ϲ���
 * <p>
 * ����:
 * ��String���͵�"123",ת��ΪInteter����,��ת����Ľ����10
 * ������֮���Integer���͵�����,ת��ΪString����
 * <p>
 * ����:
 * ת��������
 * ��һ���ǰ�String����ת��Ϊ��Integer����
 * �������ǿ���ʹ��Function<String,Integer> fun1
 * Integer i = fun1.apply("123")+10;
 * �ڶ����ǰ�Integer����ת��ΪString����
 * �������ǿ���ʹ��Function<Integer,String> fun2
 * String s = fun2.apply(i);
 * ���ǿ���ʹ��andThen����,������ת�������һ��ʹ��
 * String s = fun1.andThen(fun2).apply("123");
 * fun1�ȵ���apply����,���ַ���ת��ΪInteger
 * fun2�ٵ���apply����,��Integerת��Ϊ�ַ���
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
