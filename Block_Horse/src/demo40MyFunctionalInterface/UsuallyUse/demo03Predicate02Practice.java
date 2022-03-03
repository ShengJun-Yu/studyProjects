package demo40MyFunctionalInterface.UsuallyUse;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author : Bojack
 * @date : Created in 19:47 2022.03.03
 * 练习：集合信息筛选
 * 数组当中有多条“姓名+性别”的信息如下，
 * String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
 * 请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
 * 需要同时满足两个条件：
 * 1. 必须为女生；
 * 2. 姓名为4个字。
 * <p>
 * 分析:
 * 1.有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
 * 2.必须同时满足两个条件,所以可以使用and方法连接两个判断条件
 */
public class demo03Predicate02Practice {
    public static ArrayList<String> method(String[] s, Predicate<String> p1, Predicate<String> p2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s1 : s) {
            boolean b = p1.test(s1) && p2.test(s1);
            if (b) {
                list.add(s1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] name = {"余盛军,男", "马儿啊哈,女", "古力娜扎,女"};
        ArrayList<String> list=method(name, (String s) -> {
            String st1 = s.split(",")[0];
            return st1.length() >=4;
        }, (String s) -> {
            String st1 = s.split(",")[1];
            return st1.contains("女");
        });
        for (String i : list) {
            System.out.println(i);
        }
    }
}
