package demo44Reflection;

import java.lang.reflect.Method;

/**
 * @author : Bojack
 * @date : Created in 18:20 2022.03.09
 * Class�����ܣ�

 * 3. ��ȡ��Ա�����ǣ�
 * * Method[] getMethods()
 * * Method getMethod(String name, class<?>... parameterTypes)
 * * Method[] getDeclaredMethods()
 * * Method getDeclaredMethod(String name, class<?>... parameterTypes)
 *  * 4. ��ȡ����
 *  * * String getName()
 */
public class demo03methods_class {
    public static void main(String[] args) throws Exception {
//        ��ȡPerson��Class����
        Class personClass = Person.class;
        Method method1 = personClass.getMethod("eat");
        Person p=new Person();
        Object o = method1.invoke(p);
        System.out.println("===================");
        Method eat = personClass.getMethod("eat", String.class);
        eat.invoke(p,"banner");
        //��ȡ���з���
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }
        System.out.println("======================");
        //��ȡ����
        String aClass = personClass.getName();
        System.out.println(aClass);


    }
}
