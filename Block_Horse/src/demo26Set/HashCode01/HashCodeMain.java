package demo26Set.HashCode01;


/**
 * @author : Bojack
 * @date : Created in 19:19 2021.12.01
 * ��ϣֵ:��һ��ʮ���Ƶ�����,��ϵͳ�������(���Ƕ���ĵ�ֵַ,��һ���߼���ַ,��ģ������õ���ַ,��������ʵ�ʴ洢�������ַ)
 * ��Object����һ������,���Ի�ȡ����Ĺ�ϣֵ
 * int hashCode() ���ظö���Ĺ�ϣ��ֵ��
 * hashCode������Դ��:
 * public native int hashCode();
 * native:����÷������õ��Ǳ��ز���ϵͳ�ķ���;
 */
public class HashCodeMain {
    public static void main(String[] args) {
        //HashCode�����Ѿ���д
        Person a = new Person();
        int i = a.hashCode();
        System.out.println(i);

        Person b = new Person();
        int j = b.hashCode();
        System.out.println(j);

        /*
            toString������Դ��:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
       /*
            String��Ĺ�ϣֵ
                String����дObejct���hashCode����
        */
        String str = new String("abc");
        String str1 = new String("abc");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        String str2 = new String("�ص�");
        String str3 = new String("ͨ��");
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());


    }
}
