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
    //���final�ؼ�����ֹ���ݱ�����ı�
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random randon = new Random();//���������
        int leftMoney=totalMoney;//ʣ���Ǯ
        int leftCount=totalCount;//ʣ��Ҫ���ĺ����
        for (int i = 0; i < totalCount - 1; i++) {
//            �����ΧΪ[1��Ǯ,����ܽ��-�����]
            int Money=randon.nextInt(leftMoney -leftCount+1) + 1;
            list.add(Money);
//            ʣ�������
            leftMoney=leftMoney-Money;
//            ����һ���������������һ
            leftCount--;
        }
//        �����һ������������������
        list.add(leftMoney);
//        ����װ�������������
        return list;
    }
}
