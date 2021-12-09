package AfaceToObject.Cpolymorphism.demo01;

/**
 * @author : Bojack
 * @date : Created in 14:55 2021.11.14
 * 代码当中体现多态性，其实就是一句话：父类引用指向子类对象。
 * <p>
 * 格式：
 * 父类名称 对象名 = new 子类名称();
 * 或者：
 * 接口名称 对象名 = new 实现类名称();
 */
public class Multi {
    public static void main(String[] args) {
        Father obj = new Son02();
//        obj.method();
//        obj.methodFather();
        Person p=new Person();
        p.driver(obj);
//        obj.methodSon();
/**
 *  访问成员变量的两种方式：
 * 1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
 * 2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
 */
        System.out.println(obj.num);
        // 子类没有覆盖重写，就是父：10
        // 子类如果覆盖重写，就是子：20
        obj.methodFather01();
/**
 * 在多态的代码当中，成员方法的访问规则是：
 *   *看new的是谁，就优先用谁，没有则向上找。
 *   *口诀：编译看左边，运行看右边。
 *   *对比一下：
 *   *成员变量：编译看左边，运行还看左边。
 *   *成员方法：编译看左边，运行看右边。
 */
        Father obj01 = new Son();
        obj01.method();//父子都有，优先用子
        obj01.methodFather();// 子类没有，父类有，向上找到父类
        // 编译看左边，左边是Fu，Fu当中没有methodZi方法，所以编译报错。
//        obj.methodZi(); // 错误写法！

    }
}
