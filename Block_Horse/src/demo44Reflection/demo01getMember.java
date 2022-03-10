package demo44Reflection;

import java.lang.reflect.Field;

/**
 * @author : Bojack
 * @date : Created in 18:20 2022.03.09
 * Class�����ܣ�
 * * ��ȡ���ܣ�
 * 1. ��ȡ��Ա������
 * * Field[] getFields()
 * * Field getField(String name)
 * <p>
 * * Field[] getDeclaredFields()
 * * Field getDeclaredField(String name)
 */
public class demo01getMember {
    public static void main(String[] args) throws Exception {
//        ��ȡPerson��Class����
        Class personClass = Person.class;
        //Field[] getFields()��ȡ����public���εĳ�Ա������
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===============================");
        //��ȡָ�����Ƶĳ�Ա������ֵ
        Field a = personClass.getDeclaredField("a");
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);
        //���ñ�����ֵ
        a.set(p, "��ʢ��");
        System.out.println(p);
        System.out.println("===============================");
        //Field[] getDeclaredFields() ��ȡ���г�Ա���������������η���
        Field[] all = personClass.getDeclaredFields();
        for (Field field : all) {
            System.out.println(field);
        }
        System.out.println("===============================");
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);//��������
        Object o1 = name.get(p);
        System.out.println(o1);
    }
}
