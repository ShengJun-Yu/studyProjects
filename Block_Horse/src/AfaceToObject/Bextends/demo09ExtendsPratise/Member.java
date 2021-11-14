package AfaceToObject.Bextends.demo09ExtendsPratise;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : Bojack
 * @date : Created in 21:44 2021.11.08
 */
public class Member extends user {
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
//        获取一个集合的索引即为红包数额
        int index = new Random().nextInt(list.size());
//        取得这个红包并且删除红包集合里的这个红包
        int souMoney = list.remove(index);
//        取得红包后成员剩余的钱还给父类
        super.setMoney(super.getMoney() + souMoney);

    }
}
