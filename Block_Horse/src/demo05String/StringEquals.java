package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��14:12:27
 * ==�ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ������������
 *
 * public boolean equals(Object obj)�������������κζ���ֻ�в�����һ���ַ�������������ͬ�ĲŻ��true�����򷵻�false��
 * ע�����
 * 1. �κζ�������Object���н��ա�
 * 2. equals�������жԳ��ԣ�Ҳ����a.equals(b)��b.equals(a)Ч��һ����
 * 3. ����Ƚ�˫��һ������һ���������Ƽ��ѳ����ַ���д��ǰ�档
 * �Ƽ���"abc".equals(str)    ���Ƽ���str.equals("abc")
 *
 * public boolean equalsIgnoreCase(String str)�����Դ�Сд���������ݱȽϡ�
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char[] chara={'a','b','c'};
        String str3=new String(chara);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str1));
        System.out.println(str1.equals(str3));

        String str4=null;
        System.out.println("abc".equals(str4));
      //  System.out.println(str4.equals("abc"));//��������,����ֵΪ����ᱨ��

        //public boolean equalsIgnoreCase(String str)�����Դ�Сд���������ݱȽϡ�
        String str5="ABC";
        String str6="abc";
        System.out.println(str5.equalsIgnoreCase(str6));
        System.out.println("Abc".equalsIgnoreCase(str6));







    }
}
