package demo19DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 19:50 2021.11.23
 * 练习:
 * 请使用日期时间相关的API，计算出一个人已经出生了多少天。
 * 分析:
 * 1.使用Scanner类中的方法next,获取出生日期
 * 2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
 * 3.把Date格式的出生日期转换为毫秒值
 * 4.获取当前的日期,转换为毫秒值
 * 5.使用当前日期的毫秒值-出生日期的毫秒值
 * 6.把毫秒差值转换为天(s/1000/60/60/24)
 */
public class Pratcice {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日格式为：****年**月**日");
//      1.使用Scanner类中的方法next,获取出生日期
        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();
//      调用poorday方法传入birthday参数
        Long poorday = poorDay(birthday);
        System.out.println("你已经出生了" + poorday + "天！");
    }

    public static Long poorDay(String string) throws ParseException {
//      将生日的格式写入到SimpleDateFormat中
        SimpleDateFormat time = new SimpleDateFormat("yyyy.MM.dd");
//      使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        Date date1 = time.parse(string);
//      获取当前日期
        Date nowday = new Date();
//      使用当前日期的毫秒值-出生日期的毫秒值
        long l = nowday.getTime() - date1.getTime();
//      把毫秒差值转换为天(s/1000/60/60/24)
        Long day = l / 1000 / 3600 / 24;
        return day;

    }
}
