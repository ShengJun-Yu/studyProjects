package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Consumer;

/**
 * @author : Bojack
 * @date : Created in 15:36 2022.02.28
 * Consumer接口的默认方法andThen
 * 作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费
 * 例如:
 * Consumer<String> con1
 * Consumer<String> con2
 * String s = "hello";
 * con1.accept(s);
 * con2.accept(s);
 * 连接两个Consumer接口  再进行消费
 * con1.andThen(con2).accept(s); 谁写前边谁先消费
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
