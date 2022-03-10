package demo44Reflection;

import java.lang.reflect.Constructor;

/**
 * @author : Bojack
 * @date : Created in 18:20 2022.03.09
 * Class�����ܣ�
 * 2. ��ȡ���췽����
 * * Constructor<?>[] getConstructors()
 * * Constructor<T> getConstructor(class<?>... parameterTypes)
 * * Constructor<T> getDeclaredConstructor(class<?>... parameterTypes)
 * * Constructor<?>[] getDeclaredConstructors()
 */
public class demo02getConstructorMethods {
    public static void main(String[] args) throws Exception {
//        ��ȡPerson��Class����
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
//        constructor.setAccessible(true);
        Object o = constructor.newInstance("��ʢ��",22);
        System.out.println(o);
        System.out.println("==========================");

        Constructor constructor1 = personClass.getConstructor();
//        constructor.setAccessible(true);
        Object o1 = constructor1.newInstance();
        System.out.println(o1);


    }
}
