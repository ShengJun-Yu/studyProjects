package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Consumer;

/**
 * @author : Bojack
 * @date : Created in 15:36 2022.02.28
 *  java.util.function.Consumer<T>�ӿ���������Supplier�ӿ��෴��
 *         ����������һ�����ݣ���������һ�����ݣ������������ɷ��;�����
 *     Consumer�ӿ��а������󷽷�void accept(T t)����Ϊ����һ��ָ�����͵����ݡ�
 *
 *    Consumer�ӿ���һ�������ͽӿ�,����ִ��ʲô����,�Ϳ���ʹ��accept��������ʲô���͵�����
 *    ���ھ�����ô����(ʹ��),��Ҫ�Զ���(���,����....)
 */
public class demo02Consumer {
    public static void show(String name , Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        String name="��ʢ��";
        show(name,(String names)->{
            String s = new StringBuilder(names).reverse().toString();
            System.out.println(s);
        });
    }
}
