package demo04ArrayList;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : 2021年10月13日20:36:51
 */
public class ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("Stephen");
        list.add("Bojack");
        list.add("Jack");
        list.add("Cete");
        list.add("Nana");

        //遍历数组列表
        for (int i = 0; i < list.size(); i++) {
            System.out.println("数组第"+i+"元素为"+list.get(i));
        }

    }
}
