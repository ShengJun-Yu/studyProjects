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
//        newһ�������������淢��ÿ���������
        ArrayList<Integer> redlist = new ArrayList<>();
//        ��ȡ��ǰȺ�����
        int leftMoney = super.getMoney();
//        �����ǰ������������������ʾ�����ҷ���һ���ռ���
        if (totayMoney > leftMoney) {
            System.out.println("���㣡");
            return redlist;
        }
//        ��������ʣ����д�����
        super.setMoney(leftMoney - totayMoney);
//        ƽ���ֺ��
        int sendMoney = totayMoney / count;
//        ƽ�����е��������һ����
        int lastMoney = sendMoney + totayMoney % count;
//        ��ÿһ��������д�뼯��
        for (int i = 0; i < count; i++) {
            redlist.add(sendMoney);
        }
//        �����һ�����д�뼯��
        redlist.add(lastMoney);
//        ����װ��������ļ���
        return redlist;
    }
}
