package AfaceToObject.Bextends.demo09ExtendsPratise;


import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 21:12 2021.11.08
 */
public class Messager extends user {
    public Messager() {

    }

    public Messager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totayMoney, int count) {
//        new一个集合用来储存发的每个红包数额
        ArrayList<Integer> redlist = new ArrayList<>();
//        获取当前群主余额
        int leftMoney = super.getMoney();
//        如果当前余额比所发金额更大则提示，并且返回一个空集合
        if (totayMoney > leftMoney) {
            System.out.println("余额不足！");
            return redlist;
        }
//        发完红包后剩余金额写入余额
        super.setMoney(leftMoney - totayMoney);
//        平均分红包
        int sendMoney = totayMoney / count;
//        平均后还有的余额给最后一个人
        int lastMoney = sendMoney + totayMoney % count;
//        将每一个红包余额写入集合
        for (int i = 0; i < count; i++) {
            redlist.add(sendMoney);
        }
//        将最后一个红包写入集合
        redlist.add(lastMoney);
//        返回装满红包金额的集合
        return redlist;
    }
}
