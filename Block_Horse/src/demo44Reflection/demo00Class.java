package demo44Reflection;

/**
 * @author : Bojack
 * @date : Created in 21:10 2022.03.09
 * ��ȡClass����ķ�ʽ��
 * 1. Class.forName("ȫ����")�����ֽ����ļ����ؽ��ڴ棬����Class����
 * �����������ļ��������������������ļ��У���ȡ�ļ��������ࡣ
 * 2. ����.class��ͨ������������class��ȡ
 * �����ڲ������ݣ�
 * 3. ����.getClass()��getClass()������Object���ж����š�
 *�����ڶ����ȡ�ֽ���ķ�ʽ
 */
public class demo00Class {
    public static void main(String[] args) throws Exception {
        Class cls1 = Class.forName("demo44Reflection.Person");
        System.out.println(cls1);
        System.out.println("=============");
        Class cls2 = Person.class;
        System.out.println(cls2);
        System.out.println("=============");
        Person per=new Person();
        Class cls3 = per.getClass();
        System.out.println(cls3);

        System.out.println(cls1==cls2);
        System.out.println(cls2==cls3);


        System.out.println( Student.class==cls1);


    }
}
