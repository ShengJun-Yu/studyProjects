package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��15:38:12
 * String������ת����صĳ��÷����У�
 *
 * public char[] toCharArray()������ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ��
 * public byte[] getBytes()����õ�ǰ�ַ����ײ���ֽ����顣
 * public String replace(CharSequence oldString, CharSequence newString)��
 * �����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻֮��Ľ�����ַ�����
 * ��ע��CharSequence��˼����˵���Խ����ַ������͡�
 */
public class StringConvert {
    public static void main(String[] args) {
        // public char[] toCharArray()������ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ��
        String str="abc";
        char[] chars = str.toCharArray();
        System.out.println(chars[1]);
        System.out.println(chars.length);
        //public byte[] getBytes()����õ�ǰ�ַ����ײ���ֽ����顣
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]+"");
        }
        //public String replace(CharSequence oldString, CharSequence newString)��
        String str1="Hello World!";
        String str2=str1.replace("l","P");
        System.out.println(str2);

        //Ӧ�ã���Ϸ��������
        String ma ="������ģ�����������û��Ķ���";
        String maChang=ma.replace("��","*");
        String maChang1=maChang.replace("��","*");
        System.out.println(maChang1);



    }
}
