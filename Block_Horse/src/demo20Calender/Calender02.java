package demo20Calender;

import java.util.Calendar;
import java.util.Date;

/**
 * @author : Bojack
 * @date : Created in 20:37 2021.11.23
 * Calendar类的常用成员方法:
 * public int get(int field)：返回给定日历字段的值。
 * public void set(int field, int value)：将给定的日历字段设置为给定值。
 * public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
 * 成员方法的参数:
 * int field:日历类的字段,可以使用Calendar类的静态成员变量获取
 * public static final int YEAR = 1;	年
 * public static final int MONTH = 2;	月
 * public static final int DATE = 5;	月中的某一天
 * public static final int DAY_OF_MONTH = 5;月中的某一天
 * public static final int HOUR = 10; 		时
 * public static final int MINUTE = 12; 	分
 * public static final int SECOND = 13;	秒
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
  public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    把日历对象,转换为日期对象
   */
    private static void demoGetTime() {
        Calendar cal=Calendar.getInstance();
        Date time = cal.getTime();
        System.out.println(time);
    }


    /*
      public int get(int field)：返回给定日历字段的值。
        参数:传递指定的日历字段(YEAR,MONTH...)
        返回值:日历字段代表的具体的值
     */
    private static void demoGet() {
        Calendar cal = Calendar.getInstance();
        printlns(cal);
    }

    /*
           public void set(int field, int value)：将给定的日历字段设置为给定值。
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int value:给指定字段设置的值
     */
    private static void demoSet() {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, 4, 5, 20, 11, 2);
        printlns(cal);
    }

    /*        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        把指定的字段增加/减少指定的值
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int amount:增加/减少指定的值
                正数:增加
                负数:减少
     */
    private static void demoAdd() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        printlns(cal);
    }

    /*
     public int get(int field)：返回给定日历字段的值。
     */
    private static void printlns(Calendar cal) {
        int Year = cal.get(Calendar.YEAR);
        System.out.println(Year);
//        西方月份为0~11；中国为1~12；所以月份要加1
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
