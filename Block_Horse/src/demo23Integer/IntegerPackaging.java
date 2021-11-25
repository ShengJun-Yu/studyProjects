package demo23Integer;

/**
 * @author : Bojack
 * @date : Created in 19:56 2021.11.25
 * װ��:�ѻ������͵�����,��װ����װ����(�������͵�����->��װ��)
 * ���췽��:
 * Integer(int value) ����һ���·���� Integer ��������ʾָ���� int ֵ��
 * Integer(String s) ����һ���·���� Integer ��������ʾ String ������ָʾ�� int ֵ��
 * ���ݵ��ַ���,�����ǻ������͵��ַ���,������׳��쳣 "100" ��ȷ  "a" ���쳣
 * ��̬����:
 * static Integer valueOf(int i) ����һ����ʾָ���� int ֵ�� Integer ʵ����
 * static Integer valueOf(String s) ���ر���ָ���� String ��ֵ�� Integer ����
 * ����:�ڰ�װ����ȡ���������͵�����(��װ��->�������͵�����)
 * ��Ա����:
 * int intValue() �� int ���ͷ��ظ� Integer ��ֵ��
 */
public class IntegerPackaging {
    public static void main(String[] args) {
        //װ�乹�췽��
        Integer in = new Integer(32);
        System.out.println(in);
        Integer str = new Integer("324");
        System.out.println(str);
        //װ�侲̬����
        Integer i = Integer.valueOf(13);
        System.out.println(i);
        Integer i1 = Integer.valueOf("232");
        System.out.println(i1);
        //�����Ա����
        int int1 = i.intValue();
        System.out.println(int1);
    }
}
