package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��16:14:06
 * �ָ��ַ����ķ�����
 * public String[] split(String regex)�����ղ����Ĺ��򣬽��ַ����зֳ�Ϊ���ɲ��֡�
 * <p>
 * ע�����
 * split�����Ĳ�����ʵ��һ����������ʽ�������ѧϰ��
 * ����Ҫע�⣺�������Ӣ�ľ�㡰.�������з֣�����д"\\."��������б�ܣ�
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "aaa/sss/ccc/e43/rfwfe/frw";
        String[] s = str.split("/");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("=====================");


        String str1 = "adre wrfe egt tg e tg eg erg ";
        String[] s1 = str1.split(" ");
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
        System.out.println("=====================");

        String str2 = "adre. wrfe. egt .tg. e.tg. eg. erg ";
        String[] s2 = str2.split("\\.");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }


    }
}
