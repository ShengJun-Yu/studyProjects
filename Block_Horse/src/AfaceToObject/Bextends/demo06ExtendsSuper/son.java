package AfaceToObject.Bextends.demo06ExtendsSuper;

/**
 * @author : Bojack
 * @date : Created in 22:31 2021.10.27
 * super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：
 *
 * 1. 在本类的成员方法中，访问本类的成员变量。
 * 2. 在本类的成员方法中，访问本类的另一个成员方法。
 * 3. 在本类的构造方法中，访问本类的另一个构造方法。
 * 在第三种用法当中要注意：
 * A. this(...)调用也必须是构造方法的第一个语句，唯一一个。
 * B. super和this两种构造调用，不能同时使用。
 */
public class son extends father {
    String name ="Son";
    public son(){
        super();
    }
    public void methedSon(){
        System.out.println(super.name);
    }
    public void method(){
        super.method();//父类方法
        System.out.println("子类方法");
    }

}
