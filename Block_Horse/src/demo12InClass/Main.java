package demo12InClass;

/**
 * @author : Bojack
 * @date : Created in 21:18 2021.11.16
 * 1. 间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法。
 * 2. 直接方式，公式：
 * 类名称 对象名 = new 类名称();
 * 【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 */
public class Main {
    public static void main(String[] args) {
        ClassInClass cla=new ClassInClass();
        cla.method();// 通过外部类的对象，调用外部类的方法，里面间接在使用内部类methods
        System.out.println("===============");
//直接   外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        ClassInClass.clas sp=new ClassInClass().new clas();
        sp.methods();
        System.out.println("======================");
        ClassInMain inmain=new ClassInMain();
        inmain.ClassMethod();
    }
}
