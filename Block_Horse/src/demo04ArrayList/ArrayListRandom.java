package demo04ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021年10月13日20:59:43
 * 题目：
 * 生成6个1~33之间的随机整数，添加到集合，并遍历集合。
 * <p>
 * 思路：
 * 1. 需要存储6个数字，创建一个集合，<Integer>
 * 2. 产生随机数，需要用到Random
 * 3. 用循环6次，来产生6个随机数字：for循环
 * 4. 循环内调用r.nextInt(int n)，参数是33，0~32，整体+1才是1~33
 * 5. 把数字添加到集合中：add
 * 6. 遍历集合：for、size、get
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> ran = new ArrayList<>();
        int i = 0;
        while (i <= 5) {
            Random num=new Random();
            int r=num.nextInt(33)+1;
            ran.add(r);
            i++;
        }
        for (int a = 0; a < ran.size(); a++) {
            System.out.println(ran.get(a));
        }
    }
}
