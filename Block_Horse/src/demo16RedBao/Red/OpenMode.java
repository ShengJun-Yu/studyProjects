package demo16RedBao.Red;

import java.util.ArrayList;

public interface OpenMode {
    /**
     * �뽫totalMoney�ֳ�count�ݣ����浽ArrayList<Integer>�У����ؼ��ɡ�
     *
     * @param totalMoney            �ܽ��Ϊ������㣬�Ѿ�ת��Ϊ��������λΪ�֡�
     * @param totalCount            �������
     * @return ArrayList<Integer>	Ԫ��Ϊ��������Ľ��ֵ������Ԫ�ص�ֵ�ۺ͵����ܽ�
     */
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}