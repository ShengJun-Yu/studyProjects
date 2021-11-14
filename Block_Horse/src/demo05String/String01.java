package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��13:10:36
 * java.lang.String������ַ�����
 * API����˵��Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡�
 * ��ʵ����˵�����������е�˫�����ַ���������String��Ķ��󡣣�����û��new��Ҳ�����ǡ���
 *
 * �ַ������ص㣺
 * 1. �ַ��������������ɱ䡣���ص㡿
 * 2. ������Ϊ�ַ������ɸı䣬�����ַ����ǿ��Թ���ʹ�õġ�
 * 3. �ַ���Ч�����൱����char[]�ַ����飬���ǵײ�ԭ����byte[]�ֽ����顣
 *
 * �����ַ����ĳ���3+1�ַ�ʽ��
 * ���ֹ��췽����
 * public String()������һ���հ��ַ������������κ����ݡ�
 * public String(char[] array)�������ַ���������ݣ���������Ӧ���ַ�����
 * public String(byte[] array)�������ֽ���������ݣ���������Ӧ���ַ�����
 * һ��ֱ�Ӵ�����
 * String str = "Hello"; // �ұ�ֱ����˫����
 *
 * ע�⣺ֱ��д��˫���ţ������ַ�������
 */
public class String01 {
    public static void main(String[] args) {
        //public String()������һ���հ��ַ������������κ����ݡ�
        String str=new String();
        System.out.println(str);

        //public String(char[] array)�������ַ���������ݣ���������Ӧ���ַ�����
        char[] chara = { 'A', 'B', 'C' };
        String str1=new String(chara);
        System.out.println(str1);
        //public String(byte[] array)�������ֽ���������ݣ���������Ӧ���ַ�����
        byte[] bytea={65,66,67};
        String str2=new String(bytea);
        System.out.println(str2);
        //String str = "Hello"; // �ұ�ֱ����˫����
        String str3="Stephen";
        System.out.println(str3);

    }
}
