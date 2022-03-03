package demo40MyFunctionalInterface.UsuallyUse;

import java.util.function.Consumer;

/**
 * @author : Bojack
 * @date : Created in 15:36 2022.02.28
 * 练习:
 * 字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
 * 要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
 * 将打印性别的动作作为第二个Consumer接口的Lambda实例，
 * 将两个Consumer接口按照顺序“拼接”到一起。
 */
public class demo02Consumer02Practice {
    public static void show(String[] name, Consumer<String> con, Consumer<String> con1) {
        for (String s : name) {
            con.andThen(con1).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] name = {"Rilly,15", "Bojack,19"};

        show(name, (String names) -> {
            String s = names.split(",")[0];
            System.out.print("姓名：" + s);
        }, (String names) -> {
            String s = names.split(",")[1];
            System.out.println("年龄：" + s);
        });
    }
}
