package demo05String;

/**
 * @author : Bojack
 * @date : 2021��10��16��15:07:27
 * String�������ȡ��صĳ��÷����У�
 *
 * public int length()����ȡ�ַ������к��е��ַ��������õ��ַ������ȡ�
 * public String concat(String str)������ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ�����
 * public char charAt(int index)����ȡָ������λ�õĵ����ַ�����������0��ʼ����
 * public int indexOf(String str)�����Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ��
 */
public class StringGet {
    public static void main(String[] args) {
        // public int length()����ȡ�ַ������к��е��ַ��������õ��ַ������ȡ�
        String str="gyughieruhuirewgiruewuir";
        int lenght=str.length();
        System.out.println(lenght);

        // public String concat(String str)������ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ�����
        String str1=new String("hello");
        System.out.println(str1);
        String str2=str1.concat(str);
        System.out.println(str2);

        //public char charAt(int index)����ȡָ������λ�õĵ����ַ�����������0��ʼ����
        String name="Stephen";
        char str5=name.charAt(1);
        System.out.println(str5);

        // public int indexOf(String str)�����Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ��
        String name1 ="StephenYuyyuShengJun";
        int num=name1.indexOf("y");
        int num2=name1.indexOf("z");

        System.out.println(num);
        System.out.println(num2);

    }
}
