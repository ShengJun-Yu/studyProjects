package demo19DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author : Bojack
 * @date : Created in 19:50 2021.11.23
 * ��ϰ:
 * ��ʹ������ʱ����ص�API�������һ�����Ѿ������˶����졣
 * ����:
 * 1.ʹ��Scanner���еķ���next,��ȡ��������
 * 2.ʹ��DateFormat���еķ���parse,���ַ����ĳ�������,����ΪDate��ʽ�ĳ�������
 * 3.��Date��ʽ�ĳ�������ת��Ϊ����ֵ
 * 4.��ȡ��ǰ������,ת��Ϊ����ֵ
 * 5.ʹ�õ�ǰ���ڵĺ���ֵ-�������ڵĺ���ֵ
 * 6.�Ѻ����ֵת��Ϊ��(s/1000/60/60/24)
 */
public class Pratcice {
    public static void main(String[] args) throws ParseException {
        System.out.println("������������ո�ʽΪ��****��**��**��");
//      1.ʹ��Scanner���еķ���next,��ȡ��������
        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();
//      ����poorday��������birthday����
        Long poorday = poorDay(birthday);
        System.out.println("���Ѿ�������" + poorday + "�죡");
    }

    public static Long poorDay(String string) throws ParseException {
//      �����յĸ�ʽд�뵽SimpleDateFormat��
        SimpleDateFormat time = new SimpleDateFormat("yyyy.MM.dd");
//      ʹ��DateFormat���еķ���parse,���ַ����ĳ�������,����ΪDate��ʽ�ĳ�������
        Date date1 = time.parse(string);
//      ��ȡ��ǰ����
        Date nowday = new Date();
//      ʹ�õ�ǰ���ڵĺ���ֵ-�������ڵĺ���ֵ
        long l = nowday.getTime() - date1.getTime();
//      �Ѻ����ֵת��Ϊ��(s/1000/60/60/24)
        Long day = l / 1000 / 3600 / 24;
        return day;

    }
}
