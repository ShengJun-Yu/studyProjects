package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021年10月13日21:48:08
 * 题目：
 * 定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
 * 格式参照 {元素@元素@元素}。
 * <p>
 * System.out.println(list);       [10, 20, 30]
 * printArrayList(list);           {10@20@30}
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(122);
        list.add(34);
        System.out.println(list);
        listprin(list);
    }

    public static void listprin(ArrayList list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "@");
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            }
        }
    }
}
