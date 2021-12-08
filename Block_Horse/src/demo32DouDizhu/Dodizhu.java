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
        HashMap<Integer, String> poker = new HashMap<>();
        List<Integer> indexPoker = new ArrayList<>();
        List<String> flowew = List.of("红桃", "黑桃", "梅花", "方块");
        List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        poker.put(1, "大王");
        poker.put(2, "小王");
        Collections.addAll(indexPoker, 1, 2, 3);
        int index = 3;
        for (String n : number) {
            for (String f : flowew) {
                poker.put(index, f + n);
                indexPoker.add(index);
                index++;
            }
        }
//       2. 洗牌
        Collections.shuffle(indexPoker);
        System.out.println(indexPoker);
//        3.发牌
        ArrayList<Integer> Bojac = new ArrayList<>();
        ArrayList<Integer> Steph = new ArrayList<>();
        ArrayList<Integer> Crtrl = new ArrayList<>();
        ArrayList<Integer> DiPai = new ArrayList<>();
        for (int i = 0; i < indexPoker.size(); i++) {
            Integer s = indexPoker.get(i);
            if (i < 3) {
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
    public static void xun(ArrayList<Integer> list, HashMap<Integer, String> poker) {
//        排序
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            String s = poker.get(list.get(i));
            System.out.print(s + " ");
        }
    }

}
