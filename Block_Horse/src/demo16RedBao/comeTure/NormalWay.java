package demo16RedBao.comeTure;

import demo16RedBao.Red.OpenMode;

import java.util.ArrayList;

/**
 * @author : Bojack
 * @date : Created in 11:21 2021.11.18
 */
public class NormalWay implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list =new ArrayList<>();
        int NormalMoney=totalMoney/totalCount;//ƽ������Ľ��
        int LastMoney=NormalMoney+totalMoney%totalCount;//���һ��������Ϊƽ���������ƽ���������
        for (int i = 0; i < totalCount-1; i++) {
            list.add(NormalMoney);
        }
        list.add(LastMoney);
        return list ;
    }
}
