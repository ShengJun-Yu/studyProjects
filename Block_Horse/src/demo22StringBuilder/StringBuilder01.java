package demo22StringBuilder;

/**
 * @author : Bojack
 * @date : Created in 19:13 2021.11.25
 *     java.lang.StringBuilder��:�ַ���������,��������ַ�����Ч��
 *     ���췽��:
 *         StringBuilder() ����һ�������κ��ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
 *         StringBuilder(String str) ����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ�
 */
public class StringBuilder01 {
    public static void main(String[] args) {
//        StringBuilder() ����һ�������κ��ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
        StringBuilder str=new StringBuilder();
        System.out.println(str);
        //StringBuilder(String str) ����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ�
        StringBuilder str1=new StringBuilder("ybyby");
        System.out.println(str1);

    }
}

