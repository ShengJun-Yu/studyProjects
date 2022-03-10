package demo44Reflection;

import java.lang.reflect.Field;

/**
 * @author : Bojack
 * @date : Created in 18:20 2022.03.09
 * Class对象功能：
 * * 获取功能：
 * 1. 获取成员变量们
 * * Field[] getFields()
 * * Field getField(String name)
 * <p>
 * * Field[] getDeclaredFields()
 * * Field getDeclaredField(String name)
 */
public class demo01getMember {
    public static void main(String[] args) throws Exception {
//        获取Person的Class对象
        Class personClass = Person.class;
        //Field[] getFields()获取所用public修饰的成员变量；
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===============================");
        //获取指定名称的成员变量的值
        Field a = personClass.getDeclaredField("a");
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);
        //设置变量的值
        a.set(p, "余盛军");
        System.out.println(p);
        System.out.println("===============================");
        //Field[] getDeclaredFields() 获取所有成员变量，不考虑修饰符。
        Field[] all = personClass.getDeclaredFields();
        for (Field field : all) {
            System.out.println(field);
        }
        System.out.println("===============================");
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);//暴力反射
        Object o1 = name.get(p);
        System.out.println(o1);
    }
}
