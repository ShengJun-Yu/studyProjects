package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��15:23:50
 * �ַ����Ľ�ȡ������
 *
 * public String substring(int index)����ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ�����
 * public String substring(int begin, int end)����ȡ��begin��ʼ��һֱ��end�������м���ַ�����
 * ��ע��[begin,end)��������ߣ��������ұߡ�
 */
public class SubString {
    public static void main(String[] args) {
        //public String substring(int index)����ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ�����
        String str="Hello World";
        String str1=str.substring(2);
        System.out.println(str1);
        // public String substring(int begin, int end)����ȡ��begin��ʼ��һֱ��end�������м���ַ�����
        String str2=str.substring(2,4);
        System.out.println(str2);
    }
}
