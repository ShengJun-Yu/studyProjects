package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��13:49:15
 * <p>
 * <p>
 * <p>
 * /*
 * �ַ��������أ�������ֱ��д�ϵ�˫�����ַ����������ַ����������С�
 * <p>
 * ���ڻ���������˵��==�ǽ�����ֵ�ıȽϡ�
 * ��������������˵��==�ǽ��С���ֵַ���ıȽϡ�
 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
    }

}


