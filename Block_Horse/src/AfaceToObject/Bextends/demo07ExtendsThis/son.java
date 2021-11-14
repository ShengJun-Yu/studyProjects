package AfaceToObject.Bextends.demo07ExtendsThis;

/**
 * @author : Bojack
 * @date : Created in 22:49 2021.10.27
 * super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：
 *
 * 1. 在本类的成员方法中，访问本类的成员变量。
 * 2. 在本类的成员方法中，访问本类的另一个成员方法。
 * 3. 在本类的构造方法中，访问本类的另一个构造方法。
 * 在第三种用法当中要注意：
 * A. this(...)调用也必须是构造方法的第一个语句，唯一一个。
 * B. super和this两种构造调用，不能同时使用。
 */
public class son extends father{
    String name ="son";
    public son(){
//        super(); // 这一行不再赠送
        this(2);
//        this(3,3);//错误使用，this只能使用一次
    }
    public son(int num){
        System.out.println("本类访问本类方法");
    }
    public son(int num,int n){
    }

    public void method(){
        System.out.println("子类方法");
    }
    public void methodSon01(){
        this.method();
        System.out.println("子类方法中访问本类方法");
    }

    public void methodSon(){
        String name="son01";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
