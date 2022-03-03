package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Function;

/**
 * @author : Bojack
 * @date : Created in 20:52 2022.03.03
 * ��ϰ���Զ��庯��ģ��ƴ��
 * ��Ŀ
 * ��ʹ��Function���к���ģ�͵�ƴ�ӣ�����˳����Ҫִ�еĶ����������Ϊ��
 * String str = "����ӱ,20";
 * <p>
 * ����:
 * 1. ���ַ�����ȡ�������䲿�֣��õ��ַ�����
 * Function<String,String> "����ӱ,20"->"20"
 * 2. ����һ�����ַ���ת����Ϊint���͵����֣�
 * Function<String,Integer> "20"->20
 * 3. ����һ����int�����ۼ�100���õ����int���֡�
 * Function<Integer,Integer> 20->120
 */
public class demo04FunctionPractice {
    public static int method(String s, Function<String, String> f1, Function<String, Integer> f2, Function<Integer, Integer> f3) {
        int apply = f1.andThen(f2).andThen(f3).apply(s);
        return apply;
    }

    public static void main(String[] args) {
        String n = "��ʢ��,11";
        int apply = method(n, (s) -> s.split(",")[1], (s) -> Integer.parseInt(s), (s) -> s + 100);
        System.out.println(apply);
    }
}

