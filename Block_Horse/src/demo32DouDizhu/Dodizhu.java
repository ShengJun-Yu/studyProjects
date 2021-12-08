package demo32DouDizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author : Bojack
 * @date : Created in 9:03 2021.12.08
 * 斗地主综合案例:有序版本
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.排序
 * 5.看牌
 */
public class Dodizhu {
    public static void main(String[] args) {
//        1.准备牌

//        创建一个HashMap集合用来储存扑克牌
        HashMap<Integer, String> poker = new HashMap<>();
//        创建一个ArrayList集合用来储存扑克牌序号
        List<Integer> indexPoker = new ArrayList<>();
//        创建两个ArrayList集合用来储存花色和数字
        List<String> flowew = List.of("红桃", "黑桃", "梅花", "方块");
        List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
//        将大王和小王注入poker集合
        poker.put(1, "大王");
        poker.put(2, "小王");
//        将已使用的索引123注入indexPoker集合
        Collections.addAll(indexPoker, 1, 2, 3);
        int index = 3;
//        嵌套循环花色和数字 组装好扑克
        for (String n : number) {
            for (String f : flowew) {
                poker.put(index, f + n);
                indexPoker.add(index);
                index++;
            }
        }
//       2. 洗牌将牌序打乱
        Collections.shuffle(indexPoker);
//        打乱牌序后的扑克牌
//        System.out.println(indexPoker);
//        3.发牌

        ArrayList<Integer> Bojac = new ArrayList<>();
        ArrayList<Integer> Steph = new ArrayList<>();
        ArrayList<Integer> Crtrl = new ArrayList<>();
        ArrayList<Integer> DiPai = new ArrayList<>();
//        因为index序号是从1开始因此循环遍历indexpoker时要从1 开始循环
        for (int i = 1; i < indexPoker.size(); i++) {
            Integer s = indexPoker.get(i);
            if (i >=52) {
                DiPai.add(s);
            } else if (i % 3 == 0) {
                Bojac.add(s);
            } else if (i % 3 == 1) {
                Steph.add(s);
            } else if (i % 3 == 2) {
                Crtrl.add(s);
            }
        }
        System.out.println("Bojac的牌:");
        xun(Bojac, poker);
        System.out.println();
        System.out.println("Crtrl的牌:");
        xun(Crtrl, poker);
        System.out.println();
        System.out.println("Steph的牌:");
        xun(Steph, poker);
        System.out.println();
        System.out.println("底牌:");
        xun(DiPai, poker);
    }
/*
遍历方法
 */
    public static void xun(ArrayList<Integer> list, HashMap<Integer, String> poker) {
//        排序
        Collections.sort(list);
//        遍历每个玩家的牌
        for (int i = 0; i < list.size(); i++) {
//            使用HashMap的get方法用Key获取Value
            String s = poker.get(list.get(i));
//            输出Value
            System.out.print(s + " "+i);
        }
    }

}
