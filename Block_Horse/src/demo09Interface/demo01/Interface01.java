package demo09Interface.demo01;

/**
 * @author : Bojack
 * @date : Created in 20:12 2021.11.09
 * 接口使用步骤：
 * 1. 接口不能直接使用，必须有一个“实现类”来“实现”该接口。
 * 格式：
 * public class 实现类名称 implements 接口名称 {
 *     // ...
 * }
 * 2. 接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
 * 实现：去掉abstract关键字，加上方法体大括号。
 * 3. 创建实现类的对象，进行使用。
 *
 * 注意事项：
 * 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
 */
public class Interface01 {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
    }
}
