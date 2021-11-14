package demo06Static;

/**
 * @author : Bojack
 * @date : 2021年10月18日21:06:37
 。
 */
public class StaticMethod {
    static String name ="stephen";
    int num=10;

    public void  nostatic(){
        System.out.println("我是成员方法");
        // 成员方法可以访问成员变量
        System.out.println(num);
        // 成员方法可以访问静态变量
        System.out.println(name);
        System.out.println("-------------");
    }
    public static void yesstatic(){
        System.out.println("我是静态方法");
        System.out.println(name);
        // 静态不能直接访问非静态【重点】
//        System.out.println(num); // 错误写法！

        // 静态方法中不能使用this关键字。
//        System.out.println(this); // 错误写法！
        System.out.println("-------------");
    }

}
