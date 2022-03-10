package demo44Reflection;

/**
 * @author : Bojack
 * @date : Created in 21:10 2022.03.09
 * 获取Class对象的方式：
 * 1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
 * 多用于配置文件，将类名定义在配置文件中，读取文件，加载类。
 * 2. 类名.class：通过类名的属性class获取
 * 多用于参数传递，
 * 3. 对象.getClass()：getClass()方法在Object类中定义着。
 *多用于对象获取字节码的方式
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
