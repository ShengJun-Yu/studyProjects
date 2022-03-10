package demo44Reflection;

import java.lang.reflect.Method;

/**
 * @author : Bojack
 * @date : Created in 18:20 2022.03.09
 * Class对象功能：

 * 3. 获取成员方法们：
 * * Method[] getMethods()
 * * Method getMethod(String name, class<?>... parameterTypes)
 * * Method[] getDeclaredMethods()
 * * Method getDeclaredMethod(String name, class<?>... parameterTypes)
 *  * 4. 获取类名
 *  * * String getName()
 */
public class demo03methods_class {
    public static void main(String[] args) throws Exception {
//        获取Person的Class对象
        Class personClass = Person.class;
        Method method1 = personClass.getMethod("eat");
        Person p=new Person();
        Object o = method1.invoke(p);
        System.out.println("===================");
        Method eat = personClass.getMethod("eat", String.class);
        eat.invoke(p,"banner");
        //获取所有方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }
        System.out.println("======================");
        //获取类名
        String aClass = personClass.getName();
        System.out.println(aClass);


    }
}
