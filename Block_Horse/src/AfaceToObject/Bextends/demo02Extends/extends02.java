package AfaceToObject.Bextends.demo02Extends;

/**
 * @author : Bojack
 * @date : 2021年10月27日19:37:49
 * 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
 *
 * 直接通过子类对象访问成员变量：
 *     等号左边是谁，就优先用谁，没有则向上找。
 * 间接通过成员方法访问成员变量：
 *     该方法属于谁，就优先用谁，没有则向上找。
 */
public class extends02 {
    public static void main(String[] args) {
        Father father=new Father();
        System.out.println(father.fnum);

        Son son=new Son();
        System.out.println(son.snum);
        System.out.println(son.fnum);


        System.out.println(son.num);
        System.out.println(father.num);

        son.Smethod();
        son.fmethod();





    }
}
