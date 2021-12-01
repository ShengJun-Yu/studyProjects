package demo24Collection.Practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author : Bojack
 * @date : Created in 10:59 2021.12.01
 * 斗地主综合案例:
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 */
public class FightWithRich {
    public static void main(String[] args) {
        /*
        1.准备牌
         */
//        创建两个数组存储花色和数字
        String[] flower = {"红桃", "黑桃", "梅花", "方块"};
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
//        创建一个集合用来储存扑克牌
        ArrayList<String> poker = new ArrayList<>();
//        添加大小王
        poker.add("大王");
        poker.add("小王");
//        使用循环嵌套将花色和数字组装在一起并且添加到集合poker中
        for (String a : flower) {
            for (String b : number) {
                poker.add(a + b);

            }
        }
//        输出添加完牌后的扑克
        System.out.println(poker);
        /*
       2.洗牌
         */
//        shuffle(List<?> list) 使用默认的随机源随机排列指定的列表。随机打乱牌序
        Collections.shuffle(poker);
//        打乱后的牌序
        System.out.println(poker);
        /*
         3.发牌
         */
//        创建3个玩家和底牌集合
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if(i>50){
                dipai.add(s);
            } else if (i%3==0){
                player01.add(s);
            }else if(i%3==1){
                player02.add(s);
            }else if(i%3==2){
                player03.add(s);
            }
        }
        /*
        4.看牌
         */
        System.out.println("Bojack的牌:"+player01);
        System.out.println("Cete的牌:"+player02);
        System.out.println("Stepen的牌:"+player03);
        System.out.println("底牌:"+dipai);


    }
}
