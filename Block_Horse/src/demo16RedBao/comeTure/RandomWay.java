package demo16RedBao.comeTure;

import demo16RedBao.Red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : Bojack
 * @date : Created in 11:30 2021.11.18
 */
public class RandomWay implements OpenMode {
    @Override
    //添加final关键符防止数据被意外改变
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random randon = new Random();//创建随机数
        int leftMoney=totalMoney;//剩余的钱
        int leftCount=totalCount;//剩余要发的红包数
        for (int i = 0; i < totalCount - 1; i++) {
//            红包金额范围为[1分钱,红包总金额-红包数]
            int Money=randon.nextInt(leftMoney -leftCount+1) + 1;
            list.add(Money);
//            剩余红包金额
            leftMoney=leftMoney-Money;
//            收完一个红包后红包数量减一
            leftCount--;
        }
//        将最后一个红包金额塞入红包集合
        list.add(leftMoney);
//        返回装满红包金额的数组
        return list;
    }
}
