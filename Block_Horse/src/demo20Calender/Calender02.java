package demo20Calender;

import java.util.Calendar;
import java.util.Date;

/**
 * @author : Bojack
 * @date : Created in 20:37 2021.11.23
 * Calendar��ĳ��ó�Ա����:
 * public int get(int field)�����ظ��������ֶε�ֵ��
 * public void set(int field, int value)���������������ֶ�����Ϊ����ֵ��
 * public abstract void add(int field, int amount)�����������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
 * public Date getTime()������һ����ʾ��Calendarʱ��ֵ������Ԫ�����ڵĺ���ƫ��������Date����
 * ��Ա�����Ĳ���:
 * int field:��������ֶ�,����ʹ��Calendar��ľ�̬��Ա������ȡ
 * public static final int YEAR = 1;	��
 * public static final int MONTH = 2;	��
 * public static final int DATE = 5;	���е�ĳһ��
 * public static final int DAY_OF_MONTH = 5;���е�ĳһ��
 * public static final int HOUR = 10; 		ʱ
 * public static final int MINUTE = 12; 	��
 * public static final int SECOND = 13;	��
 */
public class Calender02 {
    public static void main(String[] args) {
        demoGet();
        System.out.println("======================");
        demoSet();
        System.out.println("======================");
        demoAdd();
        System.out.println("======================");
        demoGetTime();
    }
  /*
  public Date getTime()������һ����ʾ��Calendarʱ��ֵ������Ԫ�����ڵĺ���ƫ��������Date����
    ����������,ת��Ϊ���ڶ���
   */
    private static void demoGetTime() {
        Calendar cal=Calendar.getInstance();
        Date time = cal.getTime();
        System.out.println(time);
    }


    /*
      public int get(int field)�����ظ��������ֶε�ֵ��
        ����:����ָ���������ֶ�(YEAR,MONTH...)
        ����ֵ:�����ֶδ���ľ����ֵ
     */
    private static void demoGet() {
        Calendar cal = Calendar.getInstance();
        printlns(cal);
    }

    /*
           public void set(int field, int value)���������������ֶ�����Ϊ����ֵ��
        ����:
            int field:����ָ���������ֶ�(YEAR,MONTH...)
            int value:��ָ���ֶ����õ�ֵ
     */
    private static void demoSet() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, 4, 5, 20, 11, 2);
        printlns(cal);
    }

    /*        public abstract void add(int field, int amount)�����������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
        ��ָ�����ֶ�����/����ָ����ֵ
        ����:
            int field:����ָ���������ֶ�(YEAR,MONTH...)
            int amount:����/����ָ����ֵ
                ����:����
                ����:����
     */
    private static void demoAdd() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        printlns(cal);
    }

    /*
     public int get(int field)�����ظ��������ֶε�ֵ��
     */
    private static void printlns(Calendar cal) {
        int Year = cal.get(Calendar.YEAR);
        System.out.println(Year);
//        �����·�Ϊ0~11���й�Ϊ1~12�������·�Ҫ��1
        int Month = cal.get(Calendar.MONTH) + 1;
        System.out.println(Month);
        int Date = cal.get(Calendar.DATE);
        System.out.println(Date);
        int Hour = cal.get(Calendar.HOUR);
        System.out.println(Hour);
        int Minute = cal.get(Calendar.MINUTE);
        System.out.println(Minute);
        int Second = cal.get(Calendar.SECOND);
        System.out.println(Second);
    }
}
