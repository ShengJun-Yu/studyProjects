package demo23Integer;

/**
 * @author : Bojack
 * @date : Created in 20:40 2021.11.25
 * �����������ַ�������֮����໥ת��
 * ��������->�ַ���(String)
 * 1.�������͵�ֵ+""  ��򵥵ķ���(�����г���)
 * 2.��װ��ľ�̬����toString(����),����Object���toString() ����
 * static String toString(int i) ����һ����ʾָ�������� String ����
 * 3.String��ľ�̬����valueOf(����)
 * static String valueOf(int i) ���� int �������ַ�����ʾ��ʽ��
 * �ַ���(String)->��������
 * ʹ�ð�װ��ľ�̬����parseXXX("�ַ���");
 * Integer��: static int parseInt(String s)
 * Double��: static double parseDouble(String s)
 */
public class IntegerChang {
    public static void main(String[] args) {
//        ��������->�ַ���(String)
//        �������͵�ֵ+""
        String str=1+"";
        System.out.println(str+"���");
//        װ��ľ�̬����toString(����)
        String str1 = Integer.toString(1);
        System.out.println(str1+"���");
//        String��ľ�̬����valueOf(����)
        String str2 = String.valueOf(1);
        System.out.println(str1+"���");
//        �ַ���(String)->��������
        int i = Integer.parseInt("1");
        System.out.println(i+1);

        double v = Double.parseDouble("1.2");
        System.out.println(v+1.3);

    }
}
