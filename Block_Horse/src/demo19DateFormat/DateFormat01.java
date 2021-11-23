package demo19DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : Bojack
 * @date : Created in 19:23 2021.11.23
 * java.text.DateFormat:������/ʱ���ʽ������ĳ�����
 * ����:
 * ��ʽ����Ҳ�������� -> �ı������������ı�-> ���ڣ�
 * ��Ա����:
 * String format(Date date)  ����ָ����ģʽ,��Date����,��ʽ��Ϊ����ģʽ���ַ���
 * Date parse(String source)  �ѷ���ģʽ���ַ���,����ΪDate����
 * DateFormat����һ��������,�޷�ֱ�Ӵ�������ʹ��,����ʹ��DateFormat�������
 * <p>
 * java.text.SimpleDateFormat extends DateFormat
 * ���췽��:
 * SimpleDateFormat(String pattern)
 * �ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDateFormat��
 * ����:
 * String pattern:����ָ����ģʽ
 * ģʽ:���ִ�Сд��
 * y   ��
 * M   ��
 * d   ��
 * H   ʱ
 * m   ��
 * s   ��
 * д��Ӧ��ģʽ,���ģʽ�滻Ϊ��Ӧ�����ں�ʱ��
 * "yyyy-MM-dd HH:mm:ss"
 * ע��:
 * ģʽ�е���ĸ���ܸ���,����ģʽ�ķ��ſ��Ըı�
 * "yyyy��MM��dd�� HHʱmm��ss��"
 */
public class DateFormat01 {
    public static void main(String[] args) throws ParseException {
        demoFormat();
        demoParse();
    }

    /*
       String format(Date date)  ����ָ����ģʽ,��Date����,��ʽ��Ϊ����ģʽ���ַ���
        */
    private static void demoFormat() {
        SimpleDateFormat time = new SimpleDateFormat("HHʱmm��ss��yyyy��MM��dd��");
        Date date = new Date();
        String timename = time.format(date);
        System.out.println("demoFormat="+date);
        System.out.println("demoFormat="+timename);
    }

    /*
         ʹ��DateFormat���еķ���parse,���ı�����Ϊ����
         ʹ�ò���:
            1.����SimpleDateFormat����,���췽���д���ָ����ģʽ
            2.����SimpleDateFormat�����еķ���parse,�ѷ��Ϲ��췽����ģʽ���ַ���,����ΪDate����
            ע��:
                public Date parse(String source) throws ParseException
                parse����������һ���쳣��ParseException
                ����ַ����͹��췽����ģʽ��һ��,��ô����ͻ��׳����쳣
                ����һ���׳����쳣�ķ���,�ͱ���Ĵ�������쳣,Ҫôthrows�����׳�����쳣,Ҫôtry catch�Լ�����
     */
    private static void demoParse() throws ParseException {
        SimpleDateFormat obj =new SimpleDateFormat("HHʱmm��ss��yyyy��MM��dd��");
        Date date1 = obj.parse("19ʱ35��12��2021��11��23��");
        System.out.println(date1);

    }

}
