package demo18Date;


import java.util.Date;

/**
 * @author : Bojack
 * @date : Created in 18:34 2021.11.23
 * java.util.Date:��ʾ���ں�ʱ�����
 * �� Date ��ʾ�ض���˲�䣬��ȷ�����롣
 * ����:ǧ��֮һ�� 1000����=1��
 * �ض���˲��:һ��ʱ���,һɲ��ʱ��
 * 2088-08-08 09:55:33:333 ˲��
 * 2088-08-08 09:55:33:334 ˲��
 * 2088-08-08 09:55:33:334 ˲��
 * ...
 * ����ֵ������:���Զ�ʱ������ڽ��м���
 * 2099-01-03 �� 2088-01-01 �м�һ���ж�����
 * ��������ת��Ϊ������м���,�������,�ڰѺ���ת��Ϊ����
 * <p>
 * ������ת��Ϊ����:
 * ��ǰ������:2088-01-01
 * ʱ��ԭ��(0����):1970 �� 1 �� 1 �� 00:00:00(Ӣ����������)
 * ���Ǽ��㵱ǰ���ڵ�ʱ��ԭ��֮��һ�������˶��ٺ��� (3742767540068L)
 * ע��:
 * �й����ڶ�����,���ʱ������8��Сʱ
 * 1970 �� 1 �� 1 �� 08:00:00
 * <p>
 * �Ѻ���ת��Ϊ����:
 * 1 �� = 24 �� 60 �� 60 = 86400 ��  = 86400 x 1000 = 86400000����
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("��һ" + System.currentTimeMillis());//��ȡ��ǰϵͳʱ�䵽1970 �� 1 �� 1 �� 00:00:00�����˶��ٺ���
        demoData();
        demoLongDate();
        demoGetTime();
    }

    /*
          Date��Ĵ��������췽��
          Date(long date) :���ݺ���ֵ,�Ѻ���ֵת��ΪDate����
    */
    private static void demoLongDate() {
        Date date = new Date(3242435364l);
        System.out.println(date);
    }

    /*
           Date��Ŀղ������췽��
           Date() ��ȡ��ǰϵͳ�����ں�ʱ��
     */
    private static void demoData() {
        Date date = new Date();
        System.out.println(date);
    }
    /*
           long getTime() ������ת��Ϊ����ֵ(�൱��System.currentTimeMillis()����)
          ������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�������
     */

    private static void demoGetTime() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}