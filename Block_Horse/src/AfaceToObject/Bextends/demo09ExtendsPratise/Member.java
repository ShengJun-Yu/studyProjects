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
//        ��ȡһ�����ϵ�������Ϊ�������
        int index = new Random().nextInt(list.size());
//        ȡ������������ɾ������������������
        int souMoney = list.remove(index);
//        ȡ�ú�����Աʣ���Ǯ��������
        super.setMoney(super.getMoney() + souMoney);

    }
}
