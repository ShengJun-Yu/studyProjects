package demo20Calender;

import java.util.Calendar;

/**
 * @author : Bojack
 * @date : Created in 20:27 2021.11.23
 * java.util.Calendar��:������
 * Calendar����һ��������,����ṩ�˺ܶ���������ֶεķ���(YEAR��MONTH��DAY_OF_MONTH��HOUR )
 * Calendar���޷�ֱ�Ӵ�������ʹ��,�����һ����̬������getInstance(),�÷���������Calendar����������
 * static Calendar getInstance() ʹ��Ĭ��ʱ�������Ի������һ��������
 */
public class Calender01 {
    public static void main(String[] args) {
        Calendar instance=Calendar.getInstance();
        System.out.println(instance);
    }

}
