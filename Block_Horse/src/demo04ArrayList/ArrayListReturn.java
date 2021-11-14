package demo04ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : Bojack
 * @date : 2021年10月13日23:25:34
 * 题目：
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
 * 要求使用自定义的方法来实现筛选。
 * <p>
 * 分析：
 * 1. 需要创建一个大集合，用来存储int数字：<Integer>
 * 2. 随机数字就用Random nextInt
 * 3. 循环20次，把随机数字放入大集合：for循环、add方法
 * 4. 定义一个方法，用来进行筛选。
 * 筛选：根据大集合，筛选符合要求的元素，得到小集合。
 * 三要素
 * 返回值类型：ArrayList小集合（里面元素个数不确定）
 * 方法名称：getSmallList
 * 参数列表：ArrayList大集合（装着20个随机数字）
 * 5. 判断（if）是偶数：num % 2 == 0
 * 6. 如果是偶数，就放到小集合当中，否则不放。
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 20; i++) {
            int num = ran.nextInt(50) + 1;
            biglist.add(num);
        }
        System.out.println(biglist);

        //遍历输出
        ArrayList<Integer> sm = new ArrayList<>();
        sm = getsmall(biglist);
        for (int i = 0; i < sm.size(); i++) {
            System.out.println(sm.get(i));
        }
        //直接调用
        System.out.println(getsmall(biglist));
    }

    public static ArrayList<Integer> getsmall(ArrayList<Integer> biglist) {
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            if (biglist.get(i) % 2 == 0) {
                smalllist.add(biglist.get(i));
            }
        }
        return smalllist;
    }
}
