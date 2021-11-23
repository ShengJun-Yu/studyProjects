package demo20Calender;

import java.util.Calendar;

/**
 * @author : Bojack
 * @date : Created in 20:27 2021.11.23
 * java.util.Calendar类:日历类
 * Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
 * Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
 * static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 */
public class Calender01 {
    public static void main(String[] args) {
        Calendar instance=Calendar.getInstance();
        System.out.println(instance);
    }

}
