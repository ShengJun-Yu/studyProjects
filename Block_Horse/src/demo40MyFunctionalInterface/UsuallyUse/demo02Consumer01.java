package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Consumer;

/**
 * @author : Bojack
 * @date : Created in 15:36 2022.02.28
 * Consumer�ӿڵ�Ĭ�Ϸ���andThen
 * ����:��Ҫ����Consumer�ӿ�,���԰�����Consumer�ӿ���ϵ�һ��,�ڶ����ݽ�������
 * ����:
 * Consumer<String> con1
 * Consumer<String> con2
 * String s = "hello";
 * con1.accept(s);
 * con2.accept(s);
 * ��������Consumer�ӿ�  �ٽ�������
 * con1.andThen(con2).accept(s); ˭дǰ��˭������
 */
public class demo02Consumer01 {
    public static void show(String name, Consumer<String> con, Consumer<String> con1) {
        con.accept(name);
        con1.accept(name);
        con.andThen(con1).accept(name);
    }

    public static void main(String[] args) {
        String name = "Rilly";
        show(name, (String names) -> {
            String s = names.toUpperCase();
            System.out.println(s);
        }, (String names) -> {
            String s = names.toLowerCase();
            System.out.println(s);
        });
    }
}
